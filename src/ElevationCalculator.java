public class ElevationCalculator extends Calculator {
    private int horizontalDistance;
    private int verticalDistance;

    public ElevationCalculator(int horizontalDistance, int verticalDistance) {
        super();
        this.horizontalDistance = horizontalDistance;
        this.verticalDistance = verticalDistance;
    }

    @Override
    public String calculate() {
        return "I'm a ElevationCalculator";
    }
}
