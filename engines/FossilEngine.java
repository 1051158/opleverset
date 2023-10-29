package engines;

public class FossilEngine implements Engine {
    private String engineType;
    public FossilEngine() {
        this.engineType = "fossil engine";
    }
    @Override
    public String getEngineType() {
        return engineType;
    }
}
