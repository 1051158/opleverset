package carbuilder;
import tire.*;
import engines.*;
import car.*;

public interface CarBuilderInterface {
    public CarBuilderInterface setEngine(Engine engine);
    public CarBuilderInterface setTire(String tireSeason, RimStyle rimStyle);
    public CarBuilderInterface setType(String type);
    public Car build();
}
