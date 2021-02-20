package States;

import Events.TypeAEvent;
import Events.TypeBEvent;
import FiniteStateMachineFramework.Event.Event;
import FiniteStateMachineFramework.State.State;

public class InitialState extends State {

    private static InitialState initialState = null;

    public static InitialState getInstance() {
        if (initialState == null) {
            initialState = new InitialState();
        }
        return initialState;
    }

    private InitialState() {
        this.id = this.getClass().getName();
    }

    @Override
    public State handle(Event event) {
        if (event.getId().equals(TypeAEvent.class.getName())) {
            return SeenAOnce.getInstance();
        }
        if (event.getId().equals(TypeBEvent.class.getName())) {
            return SeenBOnce.getInstance();
        }
        return this;
    }
}
