import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        List<Calculator> calculatorList = new ArrayList<>();

        calculatorList.add(new PaceCalculator(5, 21, 0));
        calculatorList.add(new RacePredictor(5, 21, 0));
        calculatorList.add(new SplitFinder(5, 21, 0));
        calculatorList.add(new ElevationCalculator(10, 100));

        calculatorList.stream()
                .map(Calculator::calculate)
                .forEach(System.out::println);
    }
}