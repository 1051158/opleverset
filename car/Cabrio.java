package car;

import engines.Engine;
import tire.Tire;

public class Cabrio extends BaseCar {

    public Cabrio(Engine engine, Tire tire, String color, String finish) {
        super(engine, tire, color, finish);
        setCost(9000.00);
    }

    @Override
    public String getDescription() {
        return "Cabrio model, " + this.getEngine().getEngineType() + ", " + this.getTire() + ", " + this.getPaint();
    }
}
