package solution;

import util.FileAccessor;

import java.util.List;

public class Day1 {

    public static void main(final String[] args) {
        final int[] measurements = FileAccessor.loadFile("src/main/resources/input/day1.txt")
                .stream()
                .mapToInt(Integer::valueOf)
                .toArray();

        int numIncreases = 0;
        for (int i = 1; i < measurements.length; i++) {
            if (measurements[i] > measurements[i-1]) {
                numIncreases++;
            }
        }

        System.out.println("The number of measurements that are larger than the previous measurement is " + numIncreases);
    }
}
