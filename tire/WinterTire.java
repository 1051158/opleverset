package tire;

public class WinterTire implements Tire {

    private final RimStyle rimStyle;
    private final String tireType;

    public WinterTire(RimStyle rimStyle) {
        if (rimStyle == null) {
            throw new IllegalArgumentException("RimStyle cannot be null.");
        }
        this.rimStyle = rimStyle;
        this.tireType = "winter";
    }

    @Override
    public String getType() {
        return tireType;
    }

    @Override
    public RimStyle getRimStyle() {
        return rimStyle;
    }

    @Override
    public String toString() {
        return getRimStyle() + " " + getType() + " tires";
    }
}
