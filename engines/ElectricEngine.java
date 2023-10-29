package engines;

public class ElectricEngine implements Engine {
    private String engineType;
    public ElectricEngine() {
        this.engineType = "electric engine";
    }
    @Override
    public String getEngineType() {
        return engineType;
    }
}
