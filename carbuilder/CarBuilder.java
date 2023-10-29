package carbuilder;

import tire.*;
import engines.*;
import car.*;

public class CarBuilder implements CarBuilderInterface {
    private Engine engine;
    private WinterTireFactory winterTireFactory;
    private SummerTireFactory summerTireFactory;
    private Tire tire;
    private String color;
    private String finish;
    private String type;

    public CarBuilder() {
        this.winterTireFactory = new WinterTireFactory();
        this.summerTireFactory = new SummerTireFactory();
        setEngine(new FossilEngine());
        setTire("Summer", RimStyle.classic);
        setPaint("Black", "Metallic");
    }

    @Override
    public CarBuilderInterface setEngine(Engine engine) {
        this.engine = engine;
        return this;
    }

    @Override
    public CarBuilderInterface setPaint(String color, String finish) {
        this.color = color;
        this.finish = finish;
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
                return new Sedan(engine, tire, color, finish);
            case "Cabrio":
                return new Cabrio(engine, tire, color, finish);
            case "Coupe":
                return new Coupe(engine, tire, color, finish);
            case "Hatchback":
                return new Hatchback(engine, tire, color, finish);
            case "SUV":
                return new SUV(engine, tire, color, finish);
            default:
                throw new IllegalArgumentException("Invalid car type");
        }
    }
}
