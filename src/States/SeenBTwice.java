package States;

import Events.TypeAEvent;
import Events.TypeBEvent;
import FiniteStateMachineFramework.Event.Event;
import FiniteStateMachineFramework.State.State;

public class SeenBTwice extends State {
    private static SeenBTwice seenBTwice = null;

    public static SeenBTwice getInstance() {
        if (seenBTwice == null) {
            seenBTwice = new SeenBTwice();
        }
        return seenBTwice;
    }

    private SeenBTwice() {
        this.id = this.getClass().getName();
    }

    @Override
    public State handle(Event event) {
        if (event.getId().equals(TypeAEvent.class.getName())) {
            return SeenAOnce.getInstance();
        }
        if (event.getId().equals(TypeBEvent.class.getName())) {
            return ThreeInRow.getInstance();
        }
        return this;
    }
}
