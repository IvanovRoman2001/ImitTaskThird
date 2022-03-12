package imit.taskThird;

import static org.junit.Assert.*;

public class ProductPackagingTest {

    @org.junit.Test
    public void getName() {
        ProductPackaging prod = new ProductPackaging("Apple", 1);
        assertEquals("Apple", prod.getName());
    }

    @org.junit.Test
    public void getWeight() {
        ProductPackaging prod = new ProductPackaging("Apple", 1);
        assertEquals(0, Double.compare(1, prod.getWeight()));
    }

    @org.junit.Test
    public void testEquals() {
    }

    @org.junit.Test
    public void testHashCode() {
    }

    @org.junit.Test
    public void testToString() {
    }
}