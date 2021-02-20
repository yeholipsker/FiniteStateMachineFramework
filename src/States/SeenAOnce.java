package States;

import Events.TypeAEvent;
import Events.TypeBEvent;
import FiniteStateMachineFramework.Event.Event;
import FiniteStateMachineFramework.State.State;

public class SeenAOnce extends State {

    private static SeenAOnce seenAOnce = null;

    public static SeenAOnce getInstance() {
        if (seenAOnce == null) {
            seenAOnce = new SeenAOnce();
        }
        return seenAOnce;
    }

    private SeenAOnce() {
        this.id = this.getClass().getName();
    }

    @Override
    public State handle(Event event) {
        if (event.getId().equals(TypeAEvent.class.getName())) {
            return SeenATwice.getInstance();
        }
        if (event.getId().equals(TypeBEvent.class.getName())) {
            return SeenBOnce.getInstance();
        }
        return this;
    }
}
