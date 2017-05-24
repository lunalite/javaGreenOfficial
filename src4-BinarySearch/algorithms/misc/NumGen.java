package algorithms.misc;

/**
 * Created by HDK on 20/4/17.
 */

import java.lang.Math;

public class NumGen {

    /**
     * Returns a pseudo-randomly generated array of size 'size'
     * @param size  the size of the generated array
     * @return      the generated array
     */
    public static int[] randG(int size) {
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = (int) (Math.random() * size + 1);
        }
        return arr;
    }

    /**
     * Returns an ascending order generated integer array with size 'size'
     * @param size  the size of array generated starting from 0
     * @return      the generated array
     */
    public static int[] gAsc(int size) {
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = i + 1;
        }
        return arr;
    }

    /**
     * Returns a descending order generated integer array with size 'size'
     * @param size  the size of array generated starting from 'size' to 0
     * @return      the generated array
     */
    public static int[] gDesc(int size) {
        int[] arr = new int[size];
        int j = size;
        for (int i = 0; i < size; i++) {
            arr[i] = size;
            size--;
        }
        return arr;
    }
}
