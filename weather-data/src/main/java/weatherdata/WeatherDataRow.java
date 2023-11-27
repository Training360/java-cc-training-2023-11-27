package weatherdata;

import lombok.Value;

@Value
public final class WeatherDataRow {

    private final String day;

    private final int min;

    private final int max;

    public int temperatureDifference() {
        return max - min;
    }

    public static WeatherDataRow parseLine(String line) {
        var day = line.substring(2, 4).trim();
        var max = Integer.parseInt(line.substring(5, 8).trim());
        var min = Integer.parseInt(line.substring(12, 14).trim());
        var item = new WeatherDataRow(day, min, max);
        System.out.println(item);
        return item;
    }

}
