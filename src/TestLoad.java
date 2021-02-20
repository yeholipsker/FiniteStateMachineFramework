import FiniteStateMachineFramework.Event.Event;
import Events.TypeAEvent;
import Events.TypeBEvent;
import FiniteStateMachineFramework.Machine.FiniteStateMachine;
import Machines.ThreeInRowMachine;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestLoad {
    public static void main(String[] args) {
        FiniteStateMachine finiteStateMachine = new ThreeInRowMachine();
        finiteStateMachine.load();
        Event event1 = new TypeAEvent();
        Event event2 = new TypeBEvent();
        List<Event> eventList = new ArrayList<>(Arrays.asList(
                event1,
                event2,
                event2
        ));
        for (Event event : eventList) {
            finiteStateMachine.raise(event);
        }
    }
}
