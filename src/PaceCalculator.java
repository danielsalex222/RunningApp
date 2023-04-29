public class PaceCalculator extends DistanceCalculator {

    public PaceCalculator(double distance, int minutes, int seconds) {
        super(distance, minutes, seconds);
    }

    @Override
    public String calculate() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("I'm a PaceCalculator\n");
        stringBuilder.append(String.format("\tdistance: %s\n", distance));
        stringBuilder.append(String.format("\tminutes: %s\n", minutes));
        stringBuilder.append(String.format("\tseconds: %s\n", seconds));

        return stringBuilder.toString();
    }
}
