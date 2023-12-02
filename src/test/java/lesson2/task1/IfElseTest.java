package lesson2.task1;


import org.testng.annotations.Test;
import org.testng.xml.dom.Tag;

import static org.testng.AssertJUnit.assertEquals;

public class IfElseTest {
    @Test
    @Tag(name = "Example")
    public final void quadraticRootNumber() {
        assertEquals(1, IfElse.quadraticRootNumber(1.0, 2.0, 1.0));
        assertEquals(2, IfElse.quadraticRootNumber(1.0, 3.0, 2.0));
        assertEquals(0, IfElse.quadraticRootNumber(1.0, 4.0, 10.0));
    }

    @Test
    @Tag(name = "Example")
    public final void gradeNotation() {
        assertEquals("отлично", IfElse.gradeNotation(5));
        assertEquals("удовлетворительно", IfElse.gradeNotation(3));
    }

    @Test
    @Tag(name = "Example")
    public final void minBiRoot() {
        assertEquals(Double.NaN, IfElse.minBiRoot(0.0, 0.0, 1.0), 0.01);
        assertEquals(Double.NaN, IfElse.minBiRoot(0.0, 1.0, 2.0), 0.01);
        assertEquals(-2.0, IfElse.minBiRoot(0.0, 1.0, -4.0), 1.0E-10);
        assertEquals(Double.NaN, IfElse.minBiRoot(1.0, -2.0, 4.0), 0.01);
        assertEquals(Double.NaN, IfElse.minBiRoot(1.0, 3.0, 2.0), 0.01);
        assertEquals(-1.41, IfElse.minBiRoot(1.0, -3.0, 2.0), 0.01);
    }

    @Test
    @Tag(name = "Easy")
    public final void ageDescription() {
        assertEquals("1 год", IfElse.ageDescription(1));
        assertEquals("21 год", IfElse.ageDescription(21));
        assertEquals("132 года", IfElse.ageDescription(132));
        assertEquals("12 лет", IfElse.ageDescription(12));
        assertEquals("111 лет", IfElse.ageDescription(111));
        assertEquals("199 лет", IfElse.ageDescription(199));
    }

    @Test
    @Tag(name = "Easy")
    public final void timeForHalfWay() {
        assertEquals(2.5, IfElse.timeForHalfWay(1.0, 5.0, 2.0, 4.0, 3.0, 3.0), 0.01);
        assertEquals(3.67, IfElse.timeForHalfWay(4.0, 3.0, 1.0, 4.0, 1.0, 6.0), 0.01);
        assertEquals(4.4, IfElse.timeForHalfWay(3.0, 0.0, 1.0, 6.0, 2.0, 5.0), 0.01);
    }

    @Test
    @Tag(name = "Easy")
    public final void whichRookThreatens() {
        assertEquals(0, IfElse.whichRookThreatens(1, 2, 3, 4, 5, 6));
        assertEquals(1, IfElse.whichRookThreatens(5, 3, 7, 3, 4, 8));
        assertEquals(2, IfElse.whichRookThreatens(6, 8, 8, 6, 6, 3));
        assertEquals(3, IfElse.whichRookThreatens(3, 7, 8, 7, 3, 5));
    }

    @Test
    @Tag(name = "Easy")
    public final void rookOrBishopThreatens() {
        assertEquals(0, IfElse.rookOrBishopThreatens(4, 5, 5, 7, 8, 8));
        assertEquals(1, IfElse.rookOrBishopThreatens(2, 8, 6, 8, 1, 6));
        assertEquals(2, IfElse.rookOrBishopThreatens(5, 4, 3, 7, 1, 8));
        assertEquals(3, IfElse.rookOrBishopThreatens(1, 6, 7, 6, 3, 8));
    }

    @Test
    @Tag(name = "Easy")
    public final void triangleKind() {
        assertEquals(-1, IfElse.triangleKind(3.0, 7.5, 4.0));
        assertEquals(1, IfElse.triangleKind(5.0, 3.0, 4.0));
        assertEquals(2, IfElse.triangleKind(4.0, 6.0, 8.0));
        assertEquals(0, IfElse.triangleKind(1.0, 1.5, 1.5));
    }

    @Test
    @Tag(name = "Normal")
    public final void segmentLength() {
        assertEquals(-1, IfElse.segmentLength(1, 2, 3, 4));
        assertEquals(-1, IfElse.segmentLength(5, 7, 1, 3));
        assertEquals(0, IfElse.segmentLength(1, 2, 2, 4));
        assertEquals(3, IfElse.segmentLength(3, 6, 0, 9));
        assertEquals(2, IfElse.segmentLength(2, 5, 3, 9));
        assertEquals(1, IfElse.segmentLength(3, 6, 1, 4));
        assertEquals(4, IfElse.segmentLength(1, 15, 10, 14));
    }
}
