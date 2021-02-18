package FiniteStateMachineFramework.State;

import Events.Event;

public abstract class State {

    public abstract State transition(Event event);
}
