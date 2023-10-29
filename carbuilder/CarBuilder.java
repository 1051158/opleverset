package carbuilder;

import car.*;
import engines.*;
import tire.*;
import color.*;

public class CarBuilder {
    private Engine engine;
    private Tire tire;
    private String type;
    private Color color;

    public CarBuilder() {
        setEngine(new FossilEngine());
        setTire("Summer", RimStyle.classic);
        setColor("Blue", Finish.matte);
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

    public CarBuilder setColor(String color, Finish finish) {
        PaintFactory factory = new PaintFactory();
        this.color = factory.createColor(color, finish);
        return this;
    }

    public BaseCar build() {
        BaseCar car;

        switch (type) {
            case "Sedan":
                car = new Sedan(engine, tire, color);
                break;
            case "Cabrio":
                car = new Cabrio(engine, tire, color);
                break;
            case "Coupe":
                car = new Coupe(engine, tire, color);
                break;
            case "Hatchback":
                car = new Hatchback(engine, tire, color);
                break;
            case "SUV":
                car = new SUV(engine, tire, color);
                break;
            default:
                throw new IllegalArgumentException("Invalid car type");
        }
        return car;
    }
}
