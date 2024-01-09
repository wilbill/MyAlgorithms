package BinarySearchAlgo;

public class a {
    public static void main(String[] args) {
        int sortedarr[] = SortedArr(new int[]{48, 4, 6, 9, 11, 12, 14, 20, 36, 2});
        System.out.println(binary(sortedarr, 36));
    }

    //method to sort my array...needs a nested loop pls
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

    //method to binary search, to find the target in an array
    static int binary(int a[], int target) {
        int start =0;
        int end = a.length-1;
        for (int i = start; i <= end; ++i) {
            int mid = (start + end) / 2;
            if (target == a[mid]) return target;
            else if (target > a[mid]) {
                start = mid + 1; //I thought i goes to start+1;
            } else if (target < a[mid]) {
                end = mid - 1;

            }

        }
        return Integer.MIN_VALUE; //When we have failed to find what we wanted
    }
}
//        while(target!=mid) {
//            if (target == mid) {
//                return target;
//            }
//            if (target > mid) {
//                start = mid + 1;
//            }
//            else if (target < mid) {
//                end = mid - 1;
//            }
//            mid = (start+end)/2;
//            //incase it fails
//        }




