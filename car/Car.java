package car;

import engines.Engine;
import tire.Tire;

public interface Car {
    String getDescription();

    Engine getEngine();

    void setEngine(Engine engine);

    Tire getTire();

    void setTire(Tire tire);

    double getCost();

    void setCost(double newCost);
}
