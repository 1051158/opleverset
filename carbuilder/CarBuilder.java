package carbuilder;

import tire.*;
import engines.*;
import car.*;

public class CarBuilder implements CarBuilderInterface {
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

    @Override
    public CarBuilderInterface setEngine(Engine engine) {
        this.engine = engine;
        return this;
    }

    @Override
    public CarBuilderInterface setTire(String tireSeason, RimStyle rimStyle) {
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

    @Override
    public CarBuilderInterface setType(String type) {
        this.type = type;
        return this;
    }

    @Override
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
