package FiniteStateMachineFramework.State;

import FiniteStateMachineFramework.Event.Event;

public abstract class State {

    protected String id;

    public String getId() {
        return this.id;
    }

    public abstract State handle(Event event);
}
