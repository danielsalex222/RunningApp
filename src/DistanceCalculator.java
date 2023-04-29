public abstract class DistanceCalculator extends Calculator {
    protected double distance;
    protected int minutes;
    protected int seconds;

    private SpeedConverter speedConverter;
    public DistanceCalculator(double distance, int minutes, int seconds) {
        this.distance = distance;
        this.minutes = minutes;
        this.seconds = seconds;

        speedConverter = new SpeedConverter();
    }
}
