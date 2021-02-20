package FiniteStateMachineFramework.Event;

/**
 * abstract class for events - id need to be initialized in subclasses
 */
public abstract class Event {

    protected String id;

    public String getId() {
        return this.id;
    }
}
