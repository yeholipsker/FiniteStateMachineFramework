package Events;

public abstract class Event {

    EventType eventType;

    public EventType getType() {
        return this.eventType;
    }
}
