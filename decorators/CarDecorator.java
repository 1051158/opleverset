package decorators;

import car.Car;
import engines.Engine;
import tire.Tire;

public abstract class CarDecorator implements Car {
    protected Car decoratedCar;

    // Notice the change in the parameter type below
    public CarDecorator(Car decoratedCar) {
        this.decoratedCar = decoratedCar;
    }

    @Override
    public double getCost() {
        return decoratedCar.getCost();
    }

    @Override
    public void setCost(double newCost) {
        decoratedCar.setCost(newCost);
    }

    @Override
    public Engine getEngine() {
        return decoratedCar.getEngine();
    }

    @Override
    public void setEngine(Engine engine) {
        decoratedCar.setEngine(engine);
    }

    @Override
    public Tire getTire() {
        return decoratedCar.getTire();
    }

    @Override
    public void setTire(Tire tire) {
        decoratedCar.setTire(tire);
    }

    @Override
    public void setPaint(String color, String finish) {
        decoratedCar.setPaint(color, finish);
    }

    @Override
    public void getPaint() {
        decoratedCar.getPaint();
    }
}
