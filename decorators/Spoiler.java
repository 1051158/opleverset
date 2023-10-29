package decorators;

import car.Car;
import engines.Engine;

public class Spoiler extends CarDecorator {
    public Spoiler(Car decoratedCar) {
        super(decoratedCar);
        setCost(decoratedCar.getCost() + 1000);
    }

    @Override
    public String getDescription() {
        return decoratedCar.getDescription() + ", with a spoiler";
    }
}
