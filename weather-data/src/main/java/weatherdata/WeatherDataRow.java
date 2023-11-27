package weatherdata;

import lombok.Value;

@Value
public class WeatherDataRow {


    public static final int BEGIN_INDEX_OF_DAY = 2;
    public static final int END_INDEX_OF_DAY = 4;

    String day;

    int min;

    int max;

    public int temperatureDifference() {
        return max - min;
    }

    public static WeatherDataRow parseLine(String line) {
        var day = line.substring(BEGIN_INDEX_OF_DAY, END_INDEX_OF_DAY).trim();
        var max = Integer.parseInt(line.substring(5, 8).trim());
        var min = Integer.parseInt(line.substring(12, 14).trim());
        var item = new WeatherDataRow(day, min, max);
        System.out.println(item);
        return item;
    }

}
