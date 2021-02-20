package FiniteStateMachineFramework.State;

/**
 * Interface for serializing and deserializing State objects(in order to save state to file)
 */
public interface IStateSerializer {
    String serialize(State state);
    State deserialize(String s);
}
