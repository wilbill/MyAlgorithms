//BINARY SEARCH METHOD IN ALGORITHMS
package BinarySearchAlgo;

public class a {
    public static void main(String[] args) {
        int sortedarr[] = SortedArr(new int[]{48, 4, 6, 9, 11, 12, 14, 20, 36, 2});
        System.out.println(binary(sortedarr, 36));
    }

    //method to sort my array...needs a nested loop pls
    //did you know this is bubble sort?
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

    //method to binary search, to find the target in an array, since binary works with a sorted array, i have sorted also using bubble sort
    static int binary(int a[], int target) {
        int start = 0;
        int end = a.length - 1;
        if (start > end) return -1; //like a bad output
        for (int i = start; i <= end; ++i) {
            int mid = start + (end - start) / 2; //avoids integer overflow, ie when start+end > Integer.MAX
            if (target == a[mid]) return target;
            else if (target > a[mid]) {
                start = mid + 1; //I thought i goes to start+1;
            } else if (target < a[mid]) {
                end = mid - 1;
            }
        }
        return -1; //When we have failed to find what we wanted
    }

    //Both methods to binary search are true, however, the while is preferred

    static int binaryS(int a[], int target) {
        int start = 0, end = a.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target == mid) {
                return target;
            }
            if (target > mid) {
                start = mid + 1;
            } else if (target < mid) {
                end = mid - 1;
            }
        }
        return -1;
    }

    //when we dont know if the array is sorted in descending or ascending.
//    static int OrderAgnostics(int a[], int target) {
//        boolean ascend = a[0] < a[a.length - 1];
//        int start = 0, end = a.length - 1;
//
//        while (start <= end ) {
//                int mid = start + (end - start) / 2;
//                if (target == mid) {
//                    return target;
//                }
//                if (ascend){
//                    if (target > a[mid]) {
//                        start = mid + 1;
//                    } else if (target < a[mid]) {
//                        end = mid - 1;
//                    }
//                }
//
//                else if(!ascend){
//                    if(target>a[mid]){
//                        start =
//                    }
//                }
//        }
//            return -1;
//        }
}

