package imit.taskThird;

import static org.junit.Assert.*;

public class ContainStringFilterTest {
    ContainStringFilter filter = new ContainStringFilter("Земля");

    @org.junit.Test
    public void testGetPattern() {
        assertEquals("Земля", filter.getPattern());
    }

    @org.junit.Test
    public void testApplyOK() {
        assertTrue(filter.apply("Земля - третья планета солнесной системы"));
    }

    @org.junit.Test
    public void testApplyFalse() {
        assertFalse(filter.apply("У орбиты Земли"));
        assertFalse(filter.apply("Жизнь пи"));
    }
}
