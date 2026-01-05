package training;

/*
You might know some pretty large perfect squares. But what about the NEXT one?

Complete the findNextSquare method that finds the next integral perfect square after the one passed as a parameter. Recall that an integral perfect square is an integer n such that sqrt(n) is also an integer.

If the argument is itself not a perfect square then return either -1 or an empty value like None or null, depending on your language. You may assume the argument is non-negative.
 */

public class NumberFun {

    private NumberFun() {
        throw new IllegalStateException("Utility class");
    }

    public static long findNextSquare(long sq) {
        double square = sq;
        if(checkIfPerfectSquare(square)) {
            ++square;
            while(!checkIfPerfectSquare(square)) {
                square++;
            }
            return (long) square;
        } else {
            return -1;
        }

    }

    private static boolean checkIfPerfectSquare(double sq) {

        double sqrt = Math.sqrt(sq);

        return ((sqrt % 1) == 0.0);
    }
}
