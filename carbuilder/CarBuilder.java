package carbuilder;

import car.*;
import engines.*;
import tire.*;

public class CarBuilder {
    private Engine engine;
    private TireFactory tireFactory;
    private Tire tire;
    private String type;

    public CarBuilder() {
        setEngine(new FossilEngine());
        setTire("Summer", RimStyle.classic);
    }

    public CarBuilder setEngine(Engine engine) {
        this.engine = engine;
        return this;
    }

    public CarBuilder setTire(String tireStyle, RimStyle rimStyle) {
        TireFactory factory = new TireFactory();
        this.tire = factory.createTire(tireStyle, rimStyle);
        return this;
    }

    public CarBuilder setType(String type) {
        this.type = type;
        return this;
    }

    public BaseCar build() {
        BaseCar car;

        switch (type) {
            case "Sedan":
                car = new Sedan(engine, tire);
                break;
            case "Cabrio":
                car = new Cabrio(engine, tire);
                break;
            case "Coupe":
                car = new Coupe(engine, tire);
                break;
            case "Hatchback":
                car = new Hatchback(engine, tire);
                break;
            case "SUV":
                car = new SUV(engine, tire);
                break;
            default:
                throw new IllegalArgumentException("Invalid car type");
        }
        return car;
    }
}
