public class SplitFinder extends DistanceCalculator {

    public SplitFinder(double distance, int minutes, int seconds) {
        super(distance, minutes, seconds);
    }

    @Override
    public String calculate() {
        return "I'm a SplitFinder";
    }
}
