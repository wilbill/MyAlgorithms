package LinearSearchAlgo;

public class Linear1 {
    public static void main(String[] args) {
//        int [] nums ={23,45,1,2,8,19,-3,16,-11,28};
//        int targ = 19;
//        int ans = linearSearch(nums, targ);
//        System.out.println(ans);
        System.out.println(linearSearch(new int[]{23,45,1,2,8,19,-3,16,-11,28}, 19));
    }

    public static int linearSearch(int [] arr, int target){
        if(arr.length==0) return -1;
        for(int i=0; i<arr.length; ++i){
            if(arr[i]==target){
                return i;
            }
        }
        return -1;

    }
}
