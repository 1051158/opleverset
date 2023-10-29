package carbuilder;

import car.*;
import engines.*;
import tire.*;

public class CarBuilder {
    private Engine engine;
    private WinterTireFactory winterTireFactory;
    private SummerTireFactory summerTireFactory;
    private Tire tire;
    private String type;

    public CarBuilder() {
        this.winterTireFactory = new WinterTireFactory();
        this.summerTireFactory = new SummerTireFactory();
        setEngine(new FossilEngine());
        setTire("Summer", RimStyle.classic);
    }

    public CarBuilder setEngine(Engine engine) {
        this.engine = engine;
        return this;
    }

    public CarBuilder setTire(String tireSeason, RimStyle rimStyle) {
        switch (tireSeason) {
            case "Summer":
                this.tire = summerTireFactory.createTire(rimStyle);
                break;
            case "Winter":
                this.tire = winterTireFactory.createTire(rimStyle);
                break;
            default:
                throw new IllegalArgumentException("Invalid season");
        }
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
