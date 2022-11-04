package easy;

import org.junit.*;
import static org.junit.Assert.assertEquals;


public class SherlockAndSquaresTest {

    SherlockAndSquares solver = new SherlockAndSquares();

    @Test
    public void should_Determine_Number_Of_Squares_Within_Range() {
        assertEquals(3, solver.findSquares(24, 49));
        assertEquals(9855, solver.findSquares(465868129 , 988379794));
        assertEquals(1, solver.findSquares(4 , 4));
    }

}
