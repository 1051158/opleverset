package car;

import engines.Engine;
import tire.Tire;
import color.Color;

public abstract class BaseCar implements Car {
    private double cost;
    private Engine engine;
    private Tire tire;
    private Color color;

    public BaseCar(Engine engine, Tire tire, Color color) {
        setEngine(engine);
        setTire(tire);
        setColor(color);
    }

    @Override
    public Engine getEngine() {
        return this.engine;
    }

    @Override
    public void setEngine(Engine newEngine) {
        this.engine = newEngine;
    }

    @Override
    public Tire getTire() {
        return this.tire;
    }

    @Override
    public void setTire(Tire newTire) {
        this.tire = newTire;
    }

    @Override
    public Color getColor() {
        return this.color;
    }

    @Override
    public void setColor(Color newColor) {
        this.color = newColor;
    }

    @Override
    public double getCost() {
        return this.cost;
    }

    @Override
    public void setCost(double newCost) { // Updated return type
        this.cost = newCost;
    }
}
