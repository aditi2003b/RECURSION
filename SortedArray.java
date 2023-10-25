public class sortedArray {
   public static boolean isSortedArray(int[] arr,int n,int k){
        if(k==n-1){
            return true;
        }
        return arr[k]<arr[k+1] && isSortedArray(arr,n,k+1);
    }
    public static void main(String args[]){
        int[] arr={1,2,3,8,5};
        boolean f=isSortedArray(arr,5,0);
        System.out.println(f);
    }
}
