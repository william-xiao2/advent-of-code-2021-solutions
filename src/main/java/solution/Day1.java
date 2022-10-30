package solution;

import util.FileAccessor;

import java.util.stream.IntStream;

public class Day1 {

    public static void main(final String[] args) {
        final int[] measurements = FileAccessor.loadFile("src/main/resources/input/day1.txt")
                .stream()
                .mapToInt(Integer::valueOf)
                .toArray();

        final long numIncreases = IntStream.range(1, measurements.length)
                .filter(i -> measurements[i] > measurements[i-1])
                .count();

        System.out.println("The number of measurements that are larger than the previous measurement is " + numIncreases);
    }
}
