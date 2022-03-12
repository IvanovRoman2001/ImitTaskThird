package imit.taskThird;

public class PieceProductTest {
    @org.junit.Test(expected = IllegalArgumentException.class)
    public void testConstructorNegativeWeight() {
        PieceProduct product = new PieceProduct("Name", "description", -90.0);
    }
}
