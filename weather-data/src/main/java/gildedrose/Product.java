package gildedrose;

public class Product {

    private int quality;

    private QualityCalculation calculation;

    public Product(int quality, QualityCalculation calculation) {
        this.quality = quality;
        this.calculation = calculation;
    }

    public void updateQuality() {
        // Delegate
        quality = calculation.calculateQuality(quality);
    }

    public int getQuality() {
        return quality;
    }

    public void setCalculation(QualityCalculation calculation) {
        this.calculation = calculation;
    }
}
