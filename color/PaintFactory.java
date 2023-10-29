package color;

public class PaintFactory {
    public Color createColor(String color, Finish finish) {
        if (color.equalsIgnoreCase("Red")) {
            return new Red(finish);
        } else if (color.equalsIgnoreCase("Blue")) {
            return new Blue(finish);
        } else if (color.equalsIgnoreCase("Green")) {
            return new Black(finish);
        }
        return null;
    }
}
