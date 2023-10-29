package car;

import engines.Engine;
import tire.Tire;

public class Coupe extends BaseCar {

    public Coupe(Engine engine, Tire tire) {
        super(engine, tire);
        setCost(10000.00);
    }

    @Override
    public String getDescription() {
        return "Coupe model, " + this.getEngine().getEngineType() + ", " + this.getTire();
    }
}
