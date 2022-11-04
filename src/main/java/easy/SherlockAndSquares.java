package easy;

public class SherlockAndSquares {

    // Assumes that "a" is always less than "b"
    public int findSquares(int a, int b) {
        int range = b - a;
        int total = 0;
        for (int x = 0; x <= range; x++) {
            if (Math.sqrt(a) % 1 == 0 ) {
                total++;
            }
            a++;
        }
        return total;
    }
}
