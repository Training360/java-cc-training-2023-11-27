package weatherdata;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WeatherDataRowTest {

    @Test
    void difference() {
        var item = new WeatherDataRow("10", 15, 20);
        assertEquals(5, item.temperatureDifference());

    }

    @Test
    void parseLine() {
        var item = WeatherDataRow.parseLine("  21  86    59    73          57.7       0.00 F       240  6.1 250  12  1.0  87 35 1030.7");
        assertEquals(59, item.getMin());
        assertEquals(86, item.getMax());
        assertEquals("21", item.getDay());
    }
}