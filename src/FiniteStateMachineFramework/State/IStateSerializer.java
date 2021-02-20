package FiniteStateMachineFramework.State;

public interface IStateSerializer {
    String serialize(State state);
    State deserialize(String s);
}
