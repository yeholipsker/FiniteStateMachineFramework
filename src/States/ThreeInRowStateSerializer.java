package States;

import FiniteStateMachineFramework.State.IStateSerializer;
import FiniteStateMachineFramework.State.State;

import java.util.HashMap;
import java.util.Map;

/**
 * implementation for the IStateSerializer - went on simple approach -
 * id for the state is the class name(since all of them are singletons),
 * and serializing it means to save it's id, deserializing will be to
 * extract the right State from state map by id.
 */
public class ThreeInRowStateSerializer implements IStateSerializer {

    Map<String, State> states;

    public ThreeInRowStateSerializer() {
        this.states = new HashMap<>();
        this.states.put(InitialState.getInstance().getId(), InitialState.getInstance());
        this.states.put(SeenAOnce.getInstance().getId(), SeenAOnce.getInstance());
        this.states.put(SeenATwice.getInstance().getId(), SeenATwice.getInstance());
        this.states.put(SeenBOnce.getInstance().getId(), SeenBOnce.getInstance());
        this.states.put(SeenBTwice.getInstance().getId(), SeenBTwice.getInstance());
        this.states.put(ThreeInRow.getInstance().getId(), ThreeInRow.getInstance());
        this.states.put(EndlessState.getInstance().getId(), EndlessState.getInstance());
    }

    /**
     * return id as a way to identify the state
     * @param state
     * @return id
     */
    @Override
    public String serialize(State state) {
        return state.getId();
    }

    /**
     * @param s
     * @return the State from state map by id
     */
    @Override
    public State deserialize(String s) {
        return this.states.get(s);
    }
}
