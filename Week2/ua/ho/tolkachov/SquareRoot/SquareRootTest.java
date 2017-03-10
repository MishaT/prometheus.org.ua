package ua.ho.tolkachov.SquareRoot;

import static org.junit.Assert.*;

import org.junit.Test;

public class SquareRootTest {

    @Test
    public void testQuadraticEquation() {
        assertEquals("(3, 2.5, -0.5)", "x1=0.16666666666666666\nx2=-1.0", SquareRoot.quadraticEquation(3, 2.5, -0.5));
        assertEquals("(0, 0, 9999999999.0)", "x1=\nx2=", SquareRoot.quadraticEquation(0, 0, 9999999999.0));
        assertEquals("(0, 10, 0)", "x1=0.0\nx2=0.0", SquareRoot.quadraticEquation(0, 10, 0));
        assertEquals("(1, 1.1, 0.1)", "x1=-0.09999999999999998\nx2=-1.0", SquareRoot.quadraticEquation(1, 1.1, 0.1));
        assertEquals("(0, 0, 0)", "x1=\nx2=", SquareRoot.quadraticEquation(0, 0, 0));
        assertEquals("(3, -18, 27)", "x1=3.0\nx2=3.0", SquareRoot.quadraticEquation(3, -18, 27));
    }

}
