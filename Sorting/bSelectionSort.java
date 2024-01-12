package Sorting;

public class bSelectionSort {
    public static void main(String[] args) {
        int arr[] = {4,5,1,2,3};
        SelectionSort(arr); //we call the method on the array
        for(int num: arr){
            System.out.print(num+",");
        }
    }
    static int[] SelectionSort(int []a){
        for(int i=0; i<a.length; ++i){
            int min =a[i];
            for(int j =i+1; j<a.length; ++j){
                if(a[j]<min){
                    min = a[j];
                    a[j]=a[i];
                    a[i]=min;
                }
            }
        }
        return a;
    }
}
