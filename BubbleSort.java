public class BubbleSort {
    public static void bubbleSorting(int[] arr,int i,int j) {
        if (i == 0) {
            return;
        }
        if (j < i - 1) {
            if (arr[j] > arr[j + 1]) {
                int t = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = t;
            }
            bubbleSorting(arr, i, j + 1);
        } else {
            bubbleSorting(arr, i - 1, 0);
        }
    }
    public static void main(String args[]){
        int[] arr={5,4,3,2,1};
        bubbleSorting(arr,5,0);
        for(int i=0;i<5;i++){
            System.out.print(arr[i]+" ");
        }
    }

    }

