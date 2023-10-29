package carbuilder;

import tire.*;
import engines.*;
import car.*;

public interface CarBuilderInterface {
    public CarBuilderInterface setEngine(Engine engine);

    public CarBuilderInterface setTire(String tireSeason, RimStyle rimStyle);

    public CarBuilderInterface setPaint(String color, String finish);

    public CarBuilderInterface setType(String type);

    public Car build();
}
