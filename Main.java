import car.*;
import carbuilder.*;
import engines.*;
import tire.*;

public class Main {
    public static void main(String[] args) {
        CarBuilder builder = new CarBuilder();
        Car sedan = builder.setType("Sedan")
                        .setTire("Summer", RimStyle.classic)
                        .setEngine(new FossilEngine())
                        .setPaint("Red", "Matte")
                        .build();
        System.out.println(sedan.getCost());
        System.out.println(sedan.getDescription());
    }
}
