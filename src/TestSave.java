import Events.Event;
import Events.TypeAEvent;
import Events.TypeBEvent;
import FiniteStateMachineFramework.Machine.FiniteStateMachine;
import Machines.ThreeInRowMachine;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestSave {
    public static void main(String[] args) {
        FiniteStateMachine finiteStateMachine = new ThreeInRowMachine();
        Event event1 = new TypeAEvent();
        Event event2 = new TypeBEvent();
        List<Event> eventList = new ArrayList<>(Arrays.asList(
                event2,
                event1,
                event1
        ));
        for (Event event : eventList) {
            finiteStateMachine.raiseEvent(event);
        }
    }
}
