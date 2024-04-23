package Sorting;

public class aBubbleSort {
    static int[] SortedArr(int a[]) {
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; ++j) {
                if (a[i] > a[j]) {
                    //we do some swaps here, not even by function, but direct swaps, function does
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        return a; //a is a sorted array
    }

    public static void main(String[] args) {
        int k[] ={3,7,4,9,2,4,4,1,6,8};
        int sortedArray[] = SortedArr(k);
        for(int num:k) System.out.print(num+",");

    }
}