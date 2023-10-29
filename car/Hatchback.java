package car;

import engines.Engine;
import tire.Tire;

public class Hatchback extends BaseCar {

    public Hatchback(Engine engine, Tire tire, String color, String finish) {
        super(engine, tire, color, finish);
        setCost(8000.00);
    }

    @Override
    public String getDescription() {
        return "Hatchback model, " + this.getEngine().getEngineType() + ", " + this.getTire() + ", " + this.getPaint();
    }
}
