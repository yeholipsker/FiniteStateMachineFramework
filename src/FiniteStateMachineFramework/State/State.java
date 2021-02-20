package FiniteStateMachineFramework.State;

import FiniteStateMachineFramework.Event.Event;

/**
 * abstract class for user implemented states.
 * id need to be initialized in constructor.
 */
public abstract class State {

    protected String id;

    public String getId() {
        return this.id;
    }

    /**
     * abstract handle method - user need to implement the way he wants to handle the event
     * and return the right State accordingly
     * @param event to be handled
     * @return the next state
     */
    public abstract State handle(Event event);
}
