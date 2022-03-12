package imit.taskThird;

import static org.junit.Assert.*;

public class BeginStringFilterTest {
    BeginStringFilter filter = new BeginStringFilter("Земля");

    @org.junit.Test
    public void testGetPattern() {
        assertEquals("Земля", filter.getPattern());
    }

    @org.junit.Test
    public void testApplyOK() {
        assertTrue(filter.apply("Земля - наш дом!!!"));
    }

    @org.junit.Test
    public void testApplyFalse() {
        assertFalse(filter.apply("Матрица???"));
        assertFalse(filter.apply("земля"));
    }
}
