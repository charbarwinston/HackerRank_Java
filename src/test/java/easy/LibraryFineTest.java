package easy;

import org.junit.*;
import static org.junit.Assert.assertEquals;

public class LibraryFineTest {

    LibraryFine solver = new LibraryFine();

    @Test
    public void fine_For_Book_Returned_Before_Expected_Return_Date_Is_0() {
        assertEquals(0, solver.calculateFine(4,7,2018, 5,7,2018));
        assertEquals(0, solver.calculateFine(2,7,1014, 1,1,1015));
    }

    @Test
    public void fine_For_Book_Returned_On_Expected_Return_Date_Is_0() {
        assertEquals(0, solver.calculateFine(5,7,2018, 5,7,2018));
    }

    @Test
    public void fine_For_Book_Returned_Days_After_Expected_Return_Date_Is_15_Times_Days_Late() {
        assertEquals(15, solver.calculateFine(6,7,2018, 5,7,2018));
        assertEquals(30, solver.calculateFine(7,7,2018, 5,7,2018));
    }

    @Test
    public void fine_For_Book_Returned_Months_After_Expected_Return_Date_Is_500_Times_Moths_Late() {
        assertEquals(500, solver.calculateFine(6,8,2018, 5,7,2018));
        assertEquals(1000, solver.calculateFine(7,9,2018, 5,7,2018));
    }

    @Test
    public void fine_For_Book_Returned_Years_After_Expected_Return_Date_Is_10000() {
        assertEquals(10000, solver.calculateFine(6,8,2019, 5,7,2018));
        assertEquals(10000, solver.calculateFine(6,8,2020, 5,7,2018));
    }


}
