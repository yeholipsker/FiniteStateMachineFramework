package Events;

import FiniteStateMachineFramework.Event.Event;

public class TypeBEvent extends Event {
    public TypeBEvent() {
        this.id = this.getClass().getName();
    }
}
