public class RacePredictor extends DistanceCalculator {

    public RacePredictor(double distance, int minutes, int seconds) {
        super(distance, minutes, seconds);
    }

    @Override
    public String calculate() {
        return "I'm a RacePredictor";
    }
}
