package easy;

public class SherlockAndSquares {

    // Assumes that "a" is always less than "b"
    public int findSquares(int a, int b) {
        int total = 0;
        int start = 0;
        if (a - b == 0) {
            if (Math.sqrt(a) % 1 == 0) {
                return 1;
            }
        }
        while (a < b && start == 0) {
            if (Math.sqrt(a) % 1 == 0) {
                start = (int) Math.sqrt(a);
            }
            a++;
        }
        //Once you found the first square, you can keep incrementally squaring the root of the starting int until the square is higher than b
        if (start != 0) {
            while(start*start <= b) {
                start++;
                total++;
            }
        }
        return total;
    }
}
