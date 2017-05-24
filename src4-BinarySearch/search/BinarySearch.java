package algorithms.search;

import algorithms.misc.NumGen;

import java.util.Arrays;

/**
 * Created by HDK on 20/4/17.
 */

public class BinarySearch {
    private int[] sortedArr;
    private static int n;

    public enum SEARCHABLE {RECURSIVE, DIVIDENCONQUER}

    public BinarySearch(int[] _sortedArr) {
        this.sortedArr = _sortedArr;
        this.n = _sortedArr.length;
    }

    public int search(int x, SEARCHABLE searchchoice) {
        int result = 0;
        switch (searchchoice) {
            case RECURSIVE:
                result = this.internalRecursiveSearch(0, n, x);
                break;
            case DIVIDENCONQUER:
                result = this.internalDNCSearch(x);
                break;
        }
        System.out.println(result);
        return result;
    }

    private int internalRecursiveSearch(int start, int end, int key) {
        if (start < end) {
            int mid = (start + end) / 2;
            if (key < sortedArr[mid]) {
                return internalRecursiveSearch(start, mid, key);
            } else if (key > sortedArr[mid]) {
                return internalRecursiveSearch(mid + 1, end, key);
            } else {
                return mid;
            }
        }
        return -1;
    }

    private int internalDNCSearch(int key) {
        int start = 0;
        int end = n - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (key == sortedArr[mid]) {
                return mid;
            }
            if (key < sortedArr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }


    public static void main(String[] args) {
        int[] t = NumGen.gAsc(99999999);
        BinarySearch binarySearch = new BinarySearch(t);
        for (int i = 0; i <= t.length; i++) {
            binarySearch.search(i, SEARCHABLE.RECURSIVE);
        }
    }
}

