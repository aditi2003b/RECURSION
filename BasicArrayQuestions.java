public class BasicArrayQuestions {
   public static boolean isSortedArray(int[] arr,int n,int k){
        if(k==n-1){
            return true;
        }
        return arr[k]<arr[k+1] && isSortedArray(arr,n,k+1);
    }
   //how to do linear search using recursion
     public static boolean linearSeach (int[] arr,int n,int k,int target){
            if(k==n){
                return false;
            }
            return arr[k]==target || linearSeach(arr,n,k+1,target);
        }

   //To return an ArrayList we can either take ArrayList as parameter or initialize it inside
        public static ArrayList<Integer> findAllIndex(int[] arr,int k,int n,int target,ArrayList<Integer> a){
            if(k==n){
                return a;
            }
            if(arr[k]==target){
                a.add(k);
            }
            findAllIndex (arr,k+1,n,target,a);
            return a;
        }
   //We dont want to take in argument
   // Add before calls answer to not good approach though
        public static ArrayList findAllIndex2(int[] arr,int k,int target){
           ArrayList<Integer> list=new ArrayList<>();
            if(k==arr.length){
                return list;
            }
            if(arr[k]== target){
                list.add(k);
            }
            ArrayList<Integer> ansFromBelowCalls=findAllIndex2(arr,k+1,target);
            list.addAll(ansFromBelowCalls);
            return list;
        }
        public static void main(String args[]){
            int[] arr={1,2,3,3,5};
            boolean f=isSortedArray(arr,5,0);
            boolean c=linearSeach(arr,5,0,9);
            ArrayList<Integer> j=new ArrayList<>();
            j=findAllIndex(arr,0,5,2,j);
            ArrayList<Integer> l=new ArrayList<>();
            l=findAllIndex2(arr,0,3);
            System.out.println(f);
            System.out.println(c);
            System.out.println(j);
            System.out.println(l);

        }

    }


