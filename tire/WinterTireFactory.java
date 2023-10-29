package tire;

public class WinterTireFactory implements TireFactory {
    @Override
    public Tire createTire(RimStyle rimStyle) {
        return new WinterTire(rimStyle);
    }
}
