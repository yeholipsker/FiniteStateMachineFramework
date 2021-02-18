package Machines;

import Events.Event;
import States.State;

public abstract class FiniteStateMachine {
    protected State state;

    public void raiseEvent(Event event) {
        this.state = this.state.transition(event);
        System.out.println("new state is " + this.state.getClass().getName());
    }
}
