import java.util.ArrayList;
import java.util.List;

public class QuickSort {
    /*
    Chose any random element as pivot
    on left side every element should be smaller than pivot
    on the right side every element should be greater than pivot
    Divide and conquor
     */
    /*
    WORST CASE: would be taking pivot element at the last=>O(N^2)
    BEST  CASE: would be taking pivot element as middle =>O(nlogn)
    Quick sort is not stable
    in place sorting algorithm

     */
    public static int partition(List<Integer> arr,int low,int high){
        int pivot=arr.get(low);
        int i=low;
        int j=high;
        while(i<j){
            while(arr.get(i)<=pivot && i<=high){
               i++;
            }
            while(arr.get(j)>pivot && j>=low){
                j--;
            }
            if(i<j){
               int temp=arr.get(i);
               arr.set(i,arr.get(j));
               arr.set(j,temp);
            }
        }
        int temp=arr.get(low);
        arr.set(low,arr.get(j));
        arr.set(j,temp);
        return j;
    }
    public static void quickSort(List<Integer> arr,int low,int high){
        if(low<high){
            int pIndex=partition(arr,low,high);
            quickSort(arr,low,pIndex-1);
            quickSort(arr,pIndex+1,high);
        }
    }
    public static void main(String args[]){
        List<Integer> arr=new ArrayList<>();
        int[] a={4,6,2,5,7,9,1,3};
        int n=a.length;
        for(int i=0;i<n;i++){
            arr.add(a[i]);
        }
      quickSort(arr,0,n-1);
      for(int i=0;i<n;i++){
          System.out.print(arr.get(i) + " ");
      }

    }
}
