package imit.taskThird;

import static org.junit.Assert.*;

public class PackedPieceProductTest {
    PieceProduct product = new PieceProduct("apple", "green apple", 200.00);
    PackedPieceProduct packagedProduct = new PackedPieceProduct(new ProductPackaging("pack", 10.0),
            10, product);


    @org.junit.Test
    public void testGetCount() {
        assertEquals(10, packagedProduct.getCount());
    }

    /*
    @org.junit.Test
    public void testGetProduct() {
        assertEquals(product, packagedProduct.getProduct());
    } */

    @org.junit.Test
    public void testGetNetWeight() {
        assertEquals(0, Double.compare(packagedProduct.getNetWeight(), 2000.0));
    }

    @org.junit.Test
    public void testGetGrossWeight() {
        assertEquals(0, Double.compare(packagedProduct.getGrossWeight(), 2010.0));
        assertEquals(2010, packagedProduct.getGrossWeight(), 1e-10);
    }
}
