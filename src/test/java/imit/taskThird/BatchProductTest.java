package imit.taskThird;

import static org.junit.Assert.*;

public class BatchProductTest {
    ProductPackaging productPackaging = new ProductPackaging("Box", 10.0);
    PackedWeightProduct[] weightProducts = {new PackedWeightProduct(new WeightProduct("1", "2"), 11.0, productPackaging)};

    BatchProduct productBatch = new BatchProduct("xxx", weightProducts);

    @org.junit.Test
    public void testGetDescription() {
        assertEquals(productBatch.getDescription(), "xxx");
    }

    @org.junit.Test
    public void testGetProducts() {
        assertArrayEquals(weightProducts, productBatch.getProducts());
    }

    @org.junit.Test
    public void testGetWeight() {
        assertEquals(0, Double.compare(21.0, productBatch.getWeight()));
    }
}
