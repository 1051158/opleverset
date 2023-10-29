package tire;

public class SummerTireFactory implements TireFactory {
    @Override
    public Tire createTire(RimStyle rimStyle) {
        return new SummerTire(rimStyle);
    }
}
