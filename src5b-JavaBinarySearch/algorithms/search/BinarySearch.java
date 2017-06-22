package algorithms.search;

import algorithms.misc.NumGen;
import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class BinarySearch {
    public static void main(String[] args) {
        int[] t = NumGen.gAsc(99999999);
        while (true) {
            Arrays.binarySearch(t, ThreadLocalRandom.current().nextInt(0,99999999));
        }
    }
}

/*
package algorithms.search;

import algorithms.misc.NumGen;
import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] t = NumGen.gAsc(99999999);
        for (int i = 0; i <= t.length; i++) {
            Arrays.binarySearch(t, i);
        }
    }
}

*/
