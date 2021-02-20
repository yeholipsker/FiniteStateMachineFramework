package States;

import Events.TypeAEvent;
import Events.TypeBEvent;
import FiniteStateMachineFramework.Event.Event;
import FiniteStateMachineFramework.State.State;

public class SeenATwice extends State {
    private static SeenATwice seenATwice = null;

    public static SeenATwice getInstance() {
        if (seenATwice == null) {
            seenATwice = new SeenATwice();
        }
        return seenATwice;
    }

    private SeenATwice() {
        this.id = this.getClass().getName();
    }

    @Override
    public State handle(Event event) {
        if (event.getId().equals(TypeAEvent.class.getName())) {
            return ThreeInRow.getInstance();
        }
        if (event.getId().equals(TypeBEvent.class.getName())) {
            return SeenBOnce.getInstance();
        }
        return this;
    }
}
