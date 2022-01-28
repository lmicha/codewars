package fundementals;

public class PerfectSquare {

    public long findNextSquare(long square) {
        double d =  Math.sqrt(square);
        if( d % 1 == 0 ) {
            return (long) ((d + 1 ) * (d + 1));
        }
        else {
            return -1;
        }
    }
}
