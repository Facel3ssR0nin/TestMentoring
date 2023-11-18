package lesson1;

import org.testng.annotations.Test;
import org.testng.xml.dom.Tag;

import static org.testng.AssertJUnit.assertEquals;

public class SimpleTest {
    @Test
    @Tag(name = "Example")
    public void sqr() {
        assertEquals(0, Simple.sqr(0));
        assertEquals(4, Simple.sqr(2));
        assertEquals(9, Simple.sqr(-3));
    }

    @Test
    @Tag(name = "Example")
    public void sqrDouble() {
        assertEquals(0.0, Simple.sqr(0.0), 1.0E-13);
        assertEquals(4.0, Simple.sqr(2.0), 1.0E-13);
        assertEquals(9.0, Simple.sqr(-3.0), 1.0E-13);
    }

    @Test
    @Tag(name = "Example")
    public void discriminant() {
        assertEquals(0.0, Simple.discriminant(0.0, 0.0, 0.0), 1.0E-13);
        assertEquals(0.0, Simple.discriminant(1.0, -2.0, 1.0), 1.0E-13);
        assertEquals(1.0, Simple.discriminant(1.0, 3.0, 2.0), 1.0E-13);
    }

    @Test
    @Tag(name = "Example")
    public void quadraticEquationRoot() {
        assertEquals(2.0, Simple.quadraticEquationRoot(1.0, -3.0, 2.0), 1.0E-13);
        assertEquals(1.0, Simple.quadraticEquationRoot(1.0, -2.0, 1.0), 1.0E-13);
        assertEquals(-3.0, Simple.quadraticEquationRoot(1.0, 6.0, 9.0), 1.0E-13);
    }

    @Test
    @Tag(name = "Example")
    public void quadraticRootProduct() {
        assertEquals(1.0, Simple.quadraticRootProduct(1.0, -2.0, 1.0), 1.0E-13);
        assertEquals(9.0, Simple.quadraticRootProduct(1.0, 6.0, 9.0), 1.0E-13);
        assertEquals(2.0, Simple.quadraticRootProduct(1.0, 3.0, 2.0), 1.0E-13);
    }

    @Test
    @Tag(name = "Trivial")
    public void seconds() {
        assertEquals(30035, Simple.seconds(8, 20, 35));
        assertEquals(86400, Simple.seconds(24, 0, 0));
        assertEquals(13, Simple.seconds(0, 0, 13));
    }

    @Test
    @Tag(name = "Trivial")
    public void lengthInMeters() {
        assertEquals(18.98, Simple.lengthInMeters(8, 2, 11), 0.01);
        assertEquals(2.13, Simple.lengthInMeters(1, 0, 0), 0.01);
    }

    @Test
    @Tag(name = "Trivial")
    public void angleInRadian() {
        assertEquals(0.63256, Simple.angleInRadian(36, 14, 35), 1.0E-5);
        assertEquals(1.5707963267948966, Simple.angleInRadian(90, 0, 0), 1.0E-5);
    }

    @Test
    @Tag(name = "Trivial")
    public void trackLength() {
        assertEquals(5.0, Simple.trackLength(3.0, 0.0, 0.0, 4.0), 1.0E-5);
        assertEquals(1.0, Simple.trackLength(0.0, 1.0, -1.0, 1.0), 1.0E-5);
        assertEquals(1.41, Simple.trackLength(1.0, 1.0, 2.0, 2.0), 0.01);
        assertEquals(0, Simple.trackLength(0,0,0,0), 0);
    }

    @Test
    @Tag(name = "Easy")
    public void thirdDigit() {
        assertEquals(8, Simple.thirdDigit(3801));
        assertEquals(1, Simple.thirdDigit(101));
        assertEquals(0, Simple.thirdDigit(1000));
    }

    @Test
    @Tag(name = "Easy")
    public void travelMinutes() {
        assertEquals(216, Simple.travelMinutes(9, 25, 13, 1));
        assertEquals(1, Simple.travelMinutes(21, 59, 22, 0));
    }

    @Test
    @Tag(name = "Easy")
    public void accountInThreeYears() {
        assertEquals(133.1, Simple.accountInThreeYears(100, 10), 0.01);
        assertEquals(1.0, Simple.accountInThreeYears(1, 0), 0.01);
        assertEquals(104.0, Simple.accountInThreeYears(13, 100), 0.01);
    }

    @Test
    @Tag(name = "Easy")
    public void numberRevert() {
        assertEquals(874, Simple.numberRevert(478));
        assertEquals(201, Simple.numberRevert(102));
    }
}
