package color;

public class Black implements Color {

    private final Finish finish;
    private final String color;

    public Black(Finish finish) {
        if (finish == null) {
            throw new IllegalArgumentException("Finish cannot be null.");
        }
        this.finish = finish;
        this.color = "Black";
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public Finish getFinish() {
        return finish;
    }

    @Override
    public String toString() {
        return getColor() + " " + getFinish() + " finish";
    }
}
