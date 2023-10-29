package car;

import engines.Engine;
import tire.Tire;

public class Sedan extends BaseCar {

    public Sedan(Engine engine, Tire tire, String color, String finish) {
        super(engine, tire, color, finish);
        setCost(11000.00);
    }

    @Override
    public String getDescription() {
        return "Sedan model, " + this.getEngine().getEngineType() + ", " + this.getTire() + ", " + this.getPaint();
    }
}
