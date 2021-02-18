package FiniteStateMachineFramework.Machine;

import Events.Event;
import FiniteStateMachineFramework.State.State;
import FiniteStateMachineFramework.State.StateFactory;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public abstract class FiniteStateMachine {
    protected State state;
    private Path path;
    protected StateFactory stateFactory;

    public FiniteStateMachine() {
        path = Path.of("state.txt");
    }

    public void raiseEvent(Event event) {
        this.state = this.state.transition(event);
        this.save();
        System.out.println("new state is " + this.state.getClass().getName());
    }

    public void save() {
        try {
            Files.writeString(path, this.state.getClass().getName());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void load() {
        try {
            String stateName = Files.readString(path);
            this.state = this.stateFactory.get(stateName);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
