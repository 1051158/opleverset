package tire;

public class SummerTire implements Tire {

    private final RimStyle rimStyle;
    private final String tireType;

    public SummerTire(RimStyle rimStyle) {
        if (rimStyle == null) {
            throw new IllegalArgumentException("RimStyle cannot be null.");
        }
        this.rimStyle = rimStyle;
        this.tireType = "summer";
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
