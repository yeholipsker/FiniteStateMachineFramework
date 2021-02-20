package Events;

import FiniteStateMachineFramework.Event.Event;

public class TypeAEvent extends Event {
    public TypeAEvent() {
        this.id = this.getClass().getName();
    }
}
