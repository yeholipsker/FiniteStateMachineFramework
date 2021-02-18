package FiniteStateMachineFramework.State;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public abstract class StateFactory {
    protected Map<String, State> statesMap;

    public StateFactory() {
        statesMap = new HashMap<>();
    }

    public State get(String stateName) {
        return this.statesMap.get(stateName);
    }

    protected void add(State state) {
        statesMap.put(state.getClass().getName(), state);
    }

    protected void addAll(Collection<State> stateSet) {
        for (State state : stateSet) {
            this.add(state);
        }
    };
}
