package car;

import engines.Engine;
import tire.Tire;

public abstract class BaseCar implements Car {
    private double cost;
    private Engine engine;
    private Tire tire;
    private String color;
    private String finish;

    public BaseCar(Engine engine, Tire tire) {
        setEngine(engine);
        setTire(tire);
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
    public void setPaint(String color, String finish) {
        this.color = color;
        this.finish = finish;
    }

    @Override
    public void getPaint() {
        System.out.println("Color: " + this.color + ", Finish: " + this.finish);
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
