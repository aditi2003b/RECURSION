public class SelectionSort {
    public static void selectionSort(int[] arr, int start) {
        if (start == arr.length - 1) {
            return;
        }

        int minIndex = findMinIndex(arr, start, start + 1);
        if (minIndex != start) {
            int temp = arr[start];
            arr[start] = arr[minIndex];
            arr[minIndex] = temp;
        }

         selectionSort(arr, start + 1);
    }

    public static int findMinIndex(int[] arr, int minIndex, int currentIndex) {
        if (currentIndex == arr.length) {
            return minIndex;
        }

        if (arr[currentIndex] < arr[minIndex]) {
            minIndex = currentIndex;
        }

        return findMinIndex(arr, minIndex, currentIndex + 1);
    }


    public static void main(String args[]) {
        int[] arr = {1,2,3,4,5};
        selectionSort(arr,0);
        System.out.println();
        for(int i=0;i<5;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
