package States;

public class SeenBOnce extends State {

    private static SeenBOnce seenBOnce = null;

    public static SeenBOnce getInstance() {
        if (seenBOnce == null) {
            seenBOnce = new SeenBOnce();
        }
        return seenBOnce;
    }

    private SeenBOnce() {
    }
}
