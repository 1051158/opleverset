package decorators;

import car.Car;

public class HeatedSeats extends CarDecorator {
    public HeatedSeats(Car decoratedCar) {
        super(decoratedCar);
        setCost(decoratedCar.getCost() + 3000);
    }

    @Override
    public String getDescription() {
        return decoratedCar.getDescription() + ", with heated seats";
    }
}
