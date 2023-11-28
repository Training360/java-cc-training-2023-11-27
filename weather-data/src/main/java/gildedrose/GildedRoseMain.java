package gildedrose;

import java.util.HashMap;

public class GildedRoseMain {

    // if (status == Status.LEZART)
    //
    //

    public static void main(String[] args) {
        Product product = new Product(10, new CommonQualityCalculation());
        int i = 5;
        String name = "John Doe";
        
        System.out.println(product.getQuality());
        product.updateQuality();
        System.out.println(product.getQuality());


        product.setCalculation(new AgedBrieCalculation());
        product.updateQuality();
        System.out.println(product.getQuality());

        var salaries = new HashMap<Long, Long>();

    }

//    public void updateQuality(boolean increase) {
//        if (increase) {
//            quality++;
//        }
//        else {
//            quality--;
//        }
//    }

}
