package car;

import engines.Engine;
import tire.Tire;
import color.Color;

public class Coupe extends BaseCar {

    public Coupe(Engine engine, Tire tire, Color color) {
        super(engine, tire, color);
        setCost(10000.00);
    }

    @Override
    public String getDescription() {
        return "Coupe model, " + this.getEngine().getEngineType() + ", " + this.getTire();
    }
}
