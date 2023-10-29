package engines;

public class HybridEngine implements Engine {
    private String engineType;
    public HybridEngine() {
        this.engineType = "hybrid engine";
    }
    @Override
    public String getEngineType() {
        return engineType;
    }
}
