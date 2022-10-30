package solution;

import util.FileAccessor;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Day1 {

    public static void main(final String[] args) {
        final List<Integer> measurements = FileAccessor.loadFile("src/main/resources/input/day1.txt")
                .stream()
                .mapToInt(Integer::valueOf)
                .boxed()
                .collect(Collectors.toList());

        solvePart1(measurements);
        solvePart2(measurements);
    }

    private static void solvePart1(final List<Integer> measurements) {
        final long numIncreases = IntStream.range(1, measurements.size())
                .filter(i -> measurements.get(i) > measurements.get(i-1))
                .count();

        System.out.println("The number of measurements that are larger than the previous measurement is " + numIncreases);
    }

    private static void solvePart2(final List<Integer> measurements) {
        final List<Integer> windows = IntStream.range(2, measurements.size())
                .map(i -> measurements.get(i-2) + measurements.get(i-1) + measurements.get(i))
                .boxed()
                .collect(Collectors.toList());

        solvePart1(windows);
    }
}
