package imit.taskThird;

import static org.junit.Assert.*;

public class PackedWeightProductTest {
    PackedWeightProduct product = new PackedWeightProduct(new WeightProduct("Угли", "Древесные угли"), 9000.99, new ProductPackaging("Пакет", 90.0));

    @org.junit.Test(expected = IllegalArgumentException.class)
    public void testConstructorNegativeWeight() {
        PackedWeightProduct product = new PackedWeightProduct(new WeightProduct("Угли", "Древесные угли"), -9000.99, new ProductPackaging("Пакет", 90.0));
    }

    @org.junit.Test
    public void testGetNetWeight() {
        assertEquals(0, Double.compare(9000.99, product.getNetWeight()));
    }

    @org.junit.Test
    public void testGetGrossWeight() {
        assertEquals(0, Double.compare(9090.99, product.getGrossWeight()));
    }
}
