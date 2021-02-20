package States;

import Events.TypeAEvent;
import Events.TypeBEvent;
import FiniteStateMachineFramework.Event.Event;
import FiniteStateMachineFramework.State.State;

public class SeenBOnce extends State {

    private static SeenBOnce seenBOnce = null;

    public static SeenBOnce getInstance() {
        if (seenBOnce == null) {
            seenBOnce = new SeenBOnce();
        }
        return seenBOnce;
    }

    private SeenBOnce() {
        this.id = this.getClass().getName();
    }

    @Override
    public State handle(Event event) {
        if (event.getId().equals(TypeAEvent.class.getName())) {
            return SeenAOnce.getInstance();
        }
        if (event.getId().equals(TypeBEvent.class.getName())) {
            return SeenBTwice.getInstance();
        }
        return this;
    }
}
