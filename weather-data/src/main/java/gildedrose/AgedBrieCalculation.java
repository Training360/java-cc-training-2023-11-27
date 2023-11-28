package gildedrose;

public class AgedBrieCalculation implements QualityCalculation{

    @Override
    public int calculateQuality(int originalQuality) {
        return originalQuality + 1;
    }
}
