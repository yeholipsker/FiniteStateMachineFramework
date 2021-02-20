package FiniteStateMachineFramework.Machine;

import FiniteStateMachineFramework.Event.Event;
import FiniteStateMachineFramework.State.IStateSerializer;
import FiniteStateMachineFramework.State.State;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public abstract class FiniteStateMachine {
    protected State state;
    protected Path path;
    protected IStateSerializer stateSerializer;

    public FiniteStateMachine(State initialState, IStateSerializer stateSerializer) {
        this.state = initialState;
        this.path = Path.of(this.getClass().getName() + ".txt");
        this.stateSerializer = stateSerializer;
    }

    public void raise(Event event) {
        this.state = this.state.handle(event);
        this.save();
        System.out.println("current state is - " + this.state.getId());
    }

    public void save() {
        try {
            Files.writeString(path, this.stateSerializer.serialize(this.state));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void load() {
        try {
            String s = Files.readString(path);
            this.state = this.stateSerializer.deserialize(s);
            System.out.println("loaded state is - " + this.state.getId());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
