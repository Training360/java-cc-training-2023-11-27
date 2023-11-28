package gildedrose;

public class CommonQualityCalculation implements QualityCalculation{

    @Override
    public int calculateQuality(int originalQuality) {
        return originalQuality - 1;
    }
}
