package car;

import engines.Engine;
import tire.Tire;
import color.Color;

public interface Car {
    String getDescription();

    Engine getEngine();

    void setEngine(Engine engine);

    Tire getTire();

    void setTire(Tire tire);

    Color getColor();

    void setColor(Color color);

    double getCost();

    void setCost(double newCost);
}
