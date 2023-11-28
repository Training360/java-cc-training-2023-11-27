package gildedrose;

public class Main {

    public static void main(String[] args) {
        var product = new Product(10, new CommonQualityCalculation());
        System.out.println(product.getQuality());
        product.updateQuality();
        System.out.println(product.getQuality());


        product.setCalculation(new AgedBrieCalculation());
        product.updateQuality();
        System.out.println(product.getQuality());
    }
}
