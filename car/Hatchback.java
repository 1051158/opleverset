package car;

import engines.Engine;
import tire.Tire;
import color.Color;

public class Hatchback extends BaseCar {

    public Hatchback(Engine engine, Tire tire, Color color) {
        super(engine, tire, color);
        setCost(8000.00);
    }

    @Override
    public String getDescription() {
        return "Hatchback model, " + this.getEngine().getEngineType() + ", " + this.getTire();
    }
}
