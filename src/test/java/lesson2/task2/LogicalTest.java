package lesson2.task2;

import org.testng.annotations.Test;
import org.testng.xml.dom.Tag;

import static org.testng.AssertJUnit.*;

public class LogicalTest {
    @Test
    @Tag(name = "Example")
    public final void pointInsideCircle() {
        assertTrue(Logical.pointInsideCircle(1.0, 1.0, 0.0, 0.0, 2.0));
        assertFalse(Logical.pointInsideCircle(2.0, 2.0, 0.0, 0.0, 2.0));
    }

    @Test
    @Tag(name = "Easy")
    public final void isNumberHappy() {
        assertTrue(Logical.isNumberHappy(1533));
        assertTrue(Logical.isNumberHappy(9009));
        assertFalse(Logical.isNumberHappy(3644));
    }

    @Test
    @Tag(name = "Easy")
    public final void queenThreatens() {
        assertTrue(Logical.queenThreatens(3, 6, 7, 6));
        assertTrue(Logical.queenThreatens(8, 1, 1, 8));
        assertFalse(Logical.queenThreatens(7, 6, 5, 7));
    }

    @Test
    @Tag(name = "Easy")
    public final void daysInMonth() {
        assertEquals(31, Logical.daysInMonth(1, 1990));
        assertEquals(28, Logical.daysInMonth(2, 1990));
        assertEquals(31, Logical.daysInMonth(3, 1990));
        assertEquals(30, Logical.daysInMonth(4, 1990));
        assertEquals(31, Logical.daysInMonth(5, 1990));
        assertEquals(30, Logical.daysInMonth(6, 1990));
        assertEquals(31, Logical.daysInMonth(7, 1990));
        assertEquals(31, Logical.daysInMonth(8, 1990));
        assertEquals(29, Logical.daysInMonth(2, 1992));
        assertEquals(29, Logical.daysInMonth(2, 1996));
        assertEquals(28, Logical.daysInMonth(2, 1900));
        assertEquals(29, Logical.daysInMonth(2, 2000));
        assertEquals(0, Logical.daysInMonth(0, 2000));
    }

    @Test
    @Tag(name = "Normal")
    public final void circleInside() {
        assertFalse(Logical.circleInside(0.0, 0.0, 6.0, 0.0, 0.0, 5.0));
        assertFalse(Logical.circleInside(0.0, 0.0, 1.0, 10.0, 10.0, 9.0));
        assertTrue(Logical.circleInside(2.0, 2.0, 2.0, 2.0, 2.0, 2.0));
        assertTrue(Logical.circleInside(-2.0, 3.0, 2.0, -2.0, 0.0, 5.0));
        assertFalse(Logical.circleInside(1.0, 2.0, 3.0, 4.0, 5.0, 6.0));
    }

    @Test
    @Tag(name = "Normal")
    public final void brickPasses() {
        assertTrue(Logical.brickPasses(2, 10, 5, 6, 3));
        assertTrue(Logical.brickPasses(4, 4, 4, 4, 4));
        assertFalse(Logical.brickPasses(6, 5, 4, 3, 6));
        assertTrue(Logical.brickPasses(3, 2, 1, 1, 2));
    }
}
