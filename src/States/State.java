package States;

import Events.Event;
import Events.EventType;

import java.util.Map;

public abstract class State {
    protected Map<EventType, State> transitionTable;

    public State() {}

    public State transition(Event event) {
        State newState = this.transitionTable.get(event.getType());
        return newState != null ? newState : this;
    }
}
