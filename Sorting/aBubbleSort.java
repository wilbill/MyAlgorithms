package Sorting;

public class aBubbleSort {
    static int[] SortedArr(int a[]) {
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; ++j) {
                if (a[i] > a[j]) {
                    //we do some swaps here, not even by function, but direct swaps
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        return a; //a is a sorted array
    }
}