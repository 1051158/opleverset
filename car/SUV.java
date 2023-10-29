package car;

import engines.Engine;
import tire.Tire;
import color.Color;

public class SUV extends BaseCar {

    public SUV(Engine engine, Tire tire, Color color) {
        super(engine, tire, color);
        setCost(12000.00);
    }

    @Override
    public String getDescription() {
        return "SUV model, " + this.getEngine().getEngineType() + ", " + this.getTire();
    }
}
