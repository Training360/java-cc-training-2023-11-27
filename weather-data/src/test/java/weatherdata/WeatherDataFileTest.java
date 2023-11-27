package weatherdata;

import org.junit.jupiter.api.Test;

import java.nio.file.Path;

import static org.junit.jupiter.api.Assertions.*;

class WeatherDataFileTest {

    @Test
    void findSmallestTemperatureSpreed() {
        var file = new WeatherDataFile(Path.of("src/main/resources/weather.dat"));
        var result = file.findSmallestTemperatureSpreed();
        assertEquals("14", result);
    }
}