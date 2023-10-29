package tire;

public class TireFactory {
    public Tire createTire(String type, RimStyle rimStyle) {
        if (type.equalsIgnoreCase("Summer")) {
            return new SummerTire(rimStyle);
        } else if (type.equalsIgnoreCase("Winter")) {
            return new WinterTire(rimStyle);
        }
        return null;
    }
}
