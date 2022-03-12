package imit.taskThird;

public class WeightProductTest {
    @org.junit.Test(expected = IllegalArgumentException.class)
    public void testConstructorNullName() {
        WeightProduct product = new WeightProduct(null, "description string");
    }

    @org.junit.Test(expected = IllegalArgumentException.class)
    public void testConstructorNullDescription() {
        WeightProduct product = new WeightProduct("Name", null);
    }
}
