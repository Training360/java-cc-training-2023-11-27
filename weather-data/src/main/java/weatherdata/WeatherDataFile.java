package weatherdata;

import lombok.AllArgsConstructor;
import lombok.SneakyThrows;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Comparator;

import static weatherdata.WeatherDataRow.END_INDEX_OF_DAY;

@AllArgsConstructor
public class WeatherDataFile {

    private Path path;  // File -> Path

    private static boolean isTemperatureLine(String line) {
        boolean result = false;
        try {
            if (line.length() > END_INDEX_OF_DAY + 1) {
                Integer.parseInt(line.substring(WeatherDataRow.BEGIN_INDEX_OF_DAY, END_INDEX_OF_DAY));
                result = true;
            }
        }
        catch (NumberFormatException e) {
            // In the case of exception the default return value is false
        }
//        return (line.length() > END_INDEX_OF_DAY + 1) && (isNumber(line.substring(WeatherDataRow.BEGIN_INDEX_OF_DAY, END_INDEX_OF_DAY)));
        return result;
    }

    @SneakyThrows
    public String findSmallestTemperatureSpreed() {
        var item = Files.lines(path)
                .filter(WeatherDataFile::isTemperatureLine)
                .map(WeatherDataRow::parseLine)
                .min(Comparator.comparing(WeatherDataRow::temperatureDifference));

        return item
                .orElseThrow(() -> new IllegalArgumentException("No minimum found"))
                .getDay();
    }


}
