package car;

import engines.Engine;
import tire.Tire;

public class SUV extends BaseCar {

    public SUV(Engine engine, Tire tire, String color, String finish) {
        super(engine, tire, color, finish);
        setCost(12000.00);
    }

    @Override
    public String getDescription() {
        return "SUV model, " + this.getEngine().getEngineType() + ", " + this.getTire() + ", " + this.getPaint();
    }
}
