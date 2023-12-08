package triangle.mutant3;
import static org.junit.Assert.*;

import org.junit.Test;


public class TriangleMutationTest {

    @Test
    public void test1() {
        assertEquals("Test 1 failed",
            new TriangleSides(5, 2, 2).reportTriangleType(),
                TriangleSides.TriangleType.NOTRIANGLE);
    }

    @Test
    public void test2() {
        assertEquals("Test 2 failed",
            new TriangleSides(2, 3, 3).reportTriangleType(),
                TriangleSides.TriangleType.ISOSCELES);
    }

    @Test
    public void test4() {
        assertEquals("Test 4 failed",
            new TriangleSides(4, 5, 6).reportTriangleType(),
                TriangleSides.TriangleType.SCALENE);
    }

    @Test
    public void test5() {
        assertEquals("Test 5 failed",
            new TriangleSides(1, 2, 3).reportTriangleType(),
                TriangleSides.TriangleType.NOTRIANGLE);
    }

    @Test
    public void test6() {
        assertEquals("Test 6 failed",
            new TriangleSides(4, 2, 3).reportTriangleType(),
                TriangleSides.TriangleType.SCALENE);
    }

    @Test
    public void test7() {
        assertEquals("Test 7 failed",
            new TriangleSides(3, 5, 2).reportTriangleType(),
                TriangleSides.TriangleType.NOTRIANGLE);
    }
}