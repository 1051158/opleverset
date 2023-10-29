package car;

import engines.Engine;
import tire.Tire;

public abstract class BaseCar implements Car {
    private double cost;
    private Engine engine;
    private Tire tire;

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
    public double getCost() {
        return this.cost;
    }
    @Override
    public void setCost(double newCost) {  // Updated return type
       this.cost = newCost; 
    }
}
