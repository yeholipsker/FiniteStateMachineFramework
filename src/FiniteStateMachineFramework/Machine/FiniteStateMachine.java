package FiniteStateMachineFramework.Machine;

import FiniteStateMachineFramework.Event.Event;
import FiniteStateMachineFramework.State.IStateSerializer;
import FiniteStateMachineFramework.State.State;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 * abstract class for Finite State Machines - subclasses need to call super()
 * in constructor with the initial state and user implementation of IStateSerializer
 */
public abstract class FiniteStateMachine {
    protected State state;
    protected Path path;
    protected IStateSerializer stateSerializer;

    /**
     * constructor - initialize the initial state, path to save the states, and serializer(for saving states)
     * @param initialState
     * @param stateSerializer
     */
    public FiniteStateMachine(State initialState, IStateSerializer stateSerializer) {
        this.state = initialState;
        this.path = Path.of(this.getClass().getName() + ".txt");
        this.stateSerializer = stateSerializer;
    }

    /**
     * this method responsible for the transition of the state according to event
     * and saves the state in case the program will end.
     * @param event
     */
    public void raise(Event event) {
        this.state = this.state.handle(event);
        this.save();
        System.out.println("current state is - " + this.state.getId());
    }

    /**
     * saving current state to file using user implemented state serializer
     */
    public void save() {
        try {
            Files.writeString(path, this.stateSerializer.serialize(this.state));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * loading current state from file using user implemented state serializer
     */
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
