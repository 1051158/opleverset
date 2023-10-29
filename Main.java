import car.Car;
import carbuilder.CarBuilder;
import engines.FossilEngine;
import tire.RimStyle;

public class Main {
    public static void main(String[] args) {
        CarBuilder builder = new CarBuilder();
        Car sedan = builder.setType("Sedan")
                        .setTire("Summer", RimStyle.classic)
                        .setEngine(new FossilEngine())
                        .build();
        System.out.println(sedan.getCost());
        System.out.println(sedan.getDescription());
    }
}
