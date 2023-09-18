import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class DataTypes {
    public static long sum(List<Integer> numbers) {

        long s = 0; //original line: int s = 0;
        // below is a "foreach" loop which iterates through numbers
        for (int x : numbers) {
            s += x;
        }
        return s;
        // Analysis of change
        // Key Fix: Unlike Python, there is a max value to which Java Ints can store. Since the final answer...
        // should be 500_000_500_000L, this is way too much for an integer to store.
        // Therefore, the accumulator variable representing the sum (s) should be marked as a LONG
    }
}
