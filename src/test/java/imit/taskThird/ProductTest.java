package imit.taskThird;

public class ProductTest {
    @org.junit.Test(expected = IllegalArgumentException.class)
    public  void testConstructorNullName() {
        Product product = new Product(null, "description string");
    }

    @org.junit.Test(expected = IllegalArgumentException.class)
    public  void testConstructorNullDescription() {
        Product product = new Product("Name", null);
    }
}
