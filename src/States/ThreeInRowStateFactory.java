package States;

import FiniteStateMachineFramework.State.State;
import FiniteStateMachineFramework.State.StateFactory;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ThreeInRowStateFactory extends StateFactory {
    public ThreeInRowStateFactory() {
        super();
        Set<State> stateSet = new HashSet<>(Arrays.asList(
                InitialState.getInstance(),
                SeenAOnce.getInstance(),
                SeenATwice.getInstance(),
                SeenBOnce.getInstance(),
                SeenBTwice.getInstance(),
                ThreeInRow.getInstance(),
                EndlessState.getInstance()
        ));
        this.addAll(stateSet);
    }
}
