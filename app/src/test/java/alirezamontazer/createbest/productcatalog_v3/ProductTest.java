package alirezamontazer.createbest.productcatalog_v3;


import static org.junit.Assert.*;
import org.junit.Test;

public class ProductTest {
    @Test
    public void checkProductName() {
        Product aProduct = new Product("1", "DELL MONITOR", 180);
        assertEquals("Check the name of the product", "DELL MONITOR", aProduct.getProductName());
    }

    @Test
    public void checkProductId() {
        Product aProduct = new Product("1", "DELL MONITOR", 180);
        assertEquals("Check the id of the product", "1", aProduct.getId());
    }

    @Test
    public void checkProductPrice() {
        // I am making this test to fail
        Product aProduct = new Product("1", "DELL MONITOR", 180);
        // EXPECTED RESULT WAS A STRING -> "180" , THE PRICE IS AN DOUBLE -> 180
        // assertEquals("Check the price of the product", "180", aProduct.getPrice());

        // assertEquals("Check the price of the product", 180, aProduct.getPrice());

        // previous assertEquals methods were deprecated and caused errors?
         // below line runs locally and 3/3 test cases pass...
        assertEquals(180, aProduct.getPrice(), 0);
    }

}
