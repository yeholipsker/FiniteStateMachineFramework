package Machines;

import Events.Event;
import States.State;

public class FiniteStateMachine {
    private State state;
    public FiniteStateMachine(State initialState) {
        this.state = initialState;
    }

    public State getState() {
        return this.state;
    }

    public void raiseEvent(Event event) {
        this.state = this.state.transition(event);
    }
}
