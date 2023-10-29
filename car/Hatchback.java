package car;

import engines.Engine;
import tire.Tire;

public class Hatchback extends BaseCar {

    public Hatchback(Engine engine, Tire tire) {
        super(engine, tire);
        setCost(8000.00);
    }

    @Override
    public String getDescription() {
        return "Hatchback model, " + this.getEngine().getEngineType() + ", " + this.getTire();
    }
}
