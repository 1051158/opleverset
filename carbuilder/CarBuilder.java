package carbuilder;

import car.*;
import engines.*;
import tire.*;
import color.*;

public class CarBuilder {
    private Engine engine;
    private TireFactory tireFactory;
    private Tire tire;
    private String type;
    private Color color;
    private PaintFactory paintFactory;

    public CarBuilder() {
        this.tireFactory = new TireFactory();
        this.paintFactory = new PaintFactory();
        setEngine(new FossilEngine());
        setTire("Summer", RimStyle.classic);
        setColor("Black", Finish.matte);
    }

    public CarBuilder setEngine(Engine engine) {
        this.engine = engine;
        return this;
    }

    public CarBuilder setTire(String tireStyle, RimStyle rimStyle) {
        this.tire = tireFactory.createTire(tireStyle, rimStyle);
        return this;
    }

    public CarBuilder setColor(String color, Finish finish) {
        this.color = paintFactory.createColor(color, finish);
        return this;
    }

    public CarBuilder setType(String type) {
        this.type = type;
        return this;
    }

    public Car build() {
        switch (type) {
            case "Sedan":
                return new Sedan(engine, tire, color);
            case "Cabrio":
                return new Cabrio(engine, tire, color);
            case "Coupe":
                return new Coupe(engine, tire, color);
            case "Hatchback":
                return new Hatchback(engine, tire, color);
            case "SUV":
                return new SUV(engine, tire, color);
            default:
                throw new IllegalArgumentException("Invalid car type");
        }
    }
}