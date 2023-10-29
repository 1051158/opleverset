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
        this.tireFactory = new TireFactory();
        setEngine(new FossilEngine());
        setTire("Summer", RimStyle.classic);
    }

    public CarBuilder setEngine(Engine engine) {
        this.engine = engine;
        return this;
    }

    public CarBuilder setTire(String tireStyle, RimStyle rimStyle) {
        this.tire = tireFactory.createTire(tireStyle, rimStyle);
        return this;
    }

    public CarBuilder setType(String type) {
        this.type = type;
        return this;
    }

    public Car build() {
        switch (type) {
            case "Sedan":
                return new Sedan(engine, tire);
            case "Cabrio":
                return new Cabrio(engine, tire);
            case "Coupe":
                return new Coupe(engine, tire);
            case "Hatchback":
                return new Hatchback(engine, tire);
            case "SUV":
                return new SUV(engine, tire);
            default:
                throw new IllegalArgumentException("Invalid car type");
        }
    }
}