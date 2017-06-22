package algorithms.sort;

import algorithms.misc.NumGen;

public class QuickSort {
    private static int n;
    private int[] ar;

    public QuickSort(int[] ar) {
        n = ar.length;
        this.ar = ar;
    }

    public void sort() {
        this.internalSort(0, n - 1);
    }

    private void internalSort(int start, int end) {
        if (start < end) {
            int pivot = this.partition(start, end);
            this.internalSort(start, pivot - 1);
            this.internalSort(pivot + 1, end);
        }
    }

    private int partition(int start, int end) {
        int mid = (start + end) / 2;
        this.swap(start, mid);
        int pivot = this.ar[start];
        int lastSmall = start;

        for (int i = start + 1; i <= end; ++i) {
            if (this.ar[i] < pivot) {
                ++lastSmall;
                this.swap(i, lastSmall);
            }
        }

        this.swap(start, lastSmall);
        return lastSmall;
    }

    private void swap(int x, int y) {
        int temp = this.ar[x];
        this.ar[x] = this.ar[y];
        this.ar[y] = temp;
    }

    public static int getN() {
        return n;
    }

    public static void setN(int n) {
        n = n;
    }

    public static void main(String[] args) {
      while(true) {
        int[] t = NumGen.randG(9999);
        QuickSort quicksort = new QuickSort(t);
        quicksort.sort();
      }
    }
}
