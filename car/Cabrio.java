package car;

import engines.Engine;
import tire.Tire;

public class Cabrio extends BaseCar {

    public Cabrio(Engine engine, Tire tire) {
        super(engine, tire);
        setCost(9000.00);
    }

    @Override
    public String getDescription() {
        return "Cabrio model, " + this.getEngine().getEngineType() + ", " + this.getTire();
    }
}


