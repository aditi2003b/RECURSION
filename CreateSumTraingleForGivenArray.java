import java.util.*;
public class CreateSumTraingleForGivenArray{
    public static long[] create(long[] arr, long n){
       ArrayList<Long> total=new ArrayList<>();
       helper(arr,n,total);
       for(int i=0;i<n;i++){
           total.add(arr[i]);
       }
       long[] ar=new long[(int)n*(int)(n+1)/2];
       for(int i=0;i<total.size();i++){
           ar[i]=total.get(i);
       }
       return ar;


    }
    public static void helper(long[] arr,long n,ArrayList<Long> total){
        if(n==0){
            return;
        }
        long[] nn=new long[(int)n-1];
        for(int i=0;i<=n-2;i++){
            nn[i]=arr[i]+arr[i+1];
        }
        helper(nn,n-1,total);
        for(int i=0;i<nn.length;i++){
            total.add(nn[i]);
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong();
        long arr[]=new long[(int) n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextLong();
        }
        long[] nn;
        nn=create(arr,n);
        for(int i=0;i<nn.length;i++){
            System.out.print(nn[i]+" ");
        }
    }
}