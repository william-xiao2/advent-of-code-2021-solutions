package util;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

public class FileAccessor {

    /**
     * Loads a file in as a list of strings, where each string is a line in the file.
     *
     * @param filePath The file path to load data from.
     * @return the file contents.
     */
    public static List<String> loadFile(final String filePath) {
        try {
            return Files.lines(Paths.get(filePath)).collect(Collectors.toList());
        } catch (final IOException e) {
            throw new RuntimeException("Failed to load file", e);
        }
    }
}
