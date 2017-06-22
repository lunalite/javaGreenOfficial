package algorithms.sort;

import algorithms.misc.NumGen;

public class MergeSort {
    private static int n;
    private int[] arr;
    private int[] auxArr;

    public MergeSort(int[] arr) {
        n = arr.length;
        this.arr = arr;
        this.auxArr = new int[n];
    }

    public void sort() {
        this.internalSort(0, n - 1);
    }

    private void internalSort(int start, int end) {
        if (start != end) {
            if (end - start > 1) {
                int mid = (start + end) / 2;
                this.internalSort(start, mid);
                this.internalSort(mid + 1, end);
            }

            this.merge(start, end);
        }
    }

    private void merge(int start, int end) {
        int mid = (start + end) / 2;
        int i = start;
        int j = mid + 1;
        int index = 0;
        if (end - start > 0) {
            for (; i <= mid && j <= end; ++index) {
                if (this.arr[i] > this.arr[j]) {
                    this.auxArr[index] = this.arr[j];
                    ++j;
                } else if (this.arr[i] < this.arr[j]) {
                    this.auxArr[index] = this.arr[i];
                    ++i;
                } else {
                    this.auxArr[index] = this.arr[i];
                    ++i;
                    ++index;
                    this.auxArr[index] = this.arr[j];
                    ++j;
                }
            }

            int z;
            if (i <= mid) {
                for (z = i; z <= mid; ++z) {
                    this.auxArr[index] = this.arr[z];
                    ++index;
                }
            }

            if (j <= end) {
                for (z = j; z <= end; ++z) {
                    this.auxArr[index] = this.arr[z];
                    ++index;
                }
            }

            System.arraycopy(this.auxArr, 0, this.arr, start, index);
        }
    }

    public static int getN() {
        return n;
    }

    public static void setN(int n) {
        n = n;
    }

    public int[] getArr() {
        return this.arr;
    }

    public void setArr(int[] arr) {
        this.arr = arr;
    }

    public static void main(String[] args) {
        while (true) {
            int[] t = NumGen.randG(9999);
            MergeSort mergeSort = new MergeSort(t);
            mergeSort.sort();
        }
    }
}
