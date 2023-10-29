package decorators;

import car.Car;

public class Automatic extends CarDecorator {
    public Automatic(Car decoratedCar) {
        super(decoratedCar);
        setCost(decoratedCar.getCost() + 2000);
    }

    @Override
    public String getDescription() {
        return decoratedCar.getDescription() + ", with an Automatic Transmission";
    }
}
