package easy;

import org.junit.*;
import static org.junit.Assert.assertEquals;


public class SherlockAndSquaresTest {

    SherlockAndSquares solver = new SherlockAndSquares();

    @Test
    public void should_Determine_Number_Of_Squares_Within_Range() {
        assertEquals(3, solver.findSquares(24, 49));
    }

}
