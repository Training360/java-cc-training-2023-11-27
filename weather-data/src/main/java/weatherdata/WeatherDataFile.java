package weatherdata;

import lombok.AllArgsConstructor;
import lombok.SneakyThrows;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Comparator;

@AllArgsConstructor
public class WeatherDataFile {

    public static final int NUMBER_OF_HEADER_LINES = 2;
    private Path path;     // File -> Path


    private static boolean isTemperatureLine(String line) {
        return !line.startsWith("mo");
    }

    @SneakyThrows
    public String findSmallestTemperatureSpreed() {
        var item = Files.lines(path)
                .skip(NUMBER_OF_HEADER_LINES)
                .filter(WeatherDataFile::isTemperatureLine)
                .map(WeatherDataRow::parseLine)
                .min(Comparator.comparing(WeatherDataRow::temperatureDifference))
                .orElseThrow(() -> new IllegalArgumentException("No minimum found"));
        return item.getDay();
    }


}
