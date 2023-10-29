package decorators;

import car.Car;
import engines.Engine;

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
