package car;

import engines.Engine;
import tire.Tire;
import color.Color;

public class Sedan extends BaseCar {

    public Sedan(Engine engine, Tire tire, Color color) {
        super(engine, tire);
        setCost(11000.00);
    }

    @Override
    public String getDescription() {
        return "Sedan model, " + this.getEngine().getEngineType() + ", " + this.getTire();
    }
}
