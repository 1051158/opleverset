package car;

import engines.Engine;
import tire.Tire;
import color.Color;

public class Cabrio extends BaseCar {

    public Cabrio(Engine engine, Tire tire, Color color) {
        super(engine, tire, color);
        setCost(9000.00);
    }

    @Override
    public String getDescription() {
        return "Cabrio model, " + this.getEngine().getEngineType() + ", " + this.getTire();
    }
}
