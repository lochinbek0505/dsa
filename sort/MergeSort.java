package sort;

public class MergeSort {


    public static void main(String[] args) {

        int arr[] = {1, 6, 3, 8, 4, 5, 9, 10};


        mergesort(arr, 0, arr.length - 1);


        for (int num : arr) {

            System.out.print(num + " ");

        }


    }


    public static void mergesort(int[] arr, int low, int high) {


        if (low < high) {

            int mid = (low + high) / 2;
            mergesort(arr, low, mid);
            mergesort(arr, mid + 1, high);
            merge(arr, low, mid, high);
        }

    }

    private static void merge(int[] arr, int low, int mid, int high) {

        int n1 = mid - low + 1;
        int n2 = high - mid;
        int larr[] = new int[n1];
        int harr[] = new int[n2];

        for (int x = 0; x < n1; x++) {
            larr[x] = arr[low + x];
        }
        for (int x = 0; x < n2; x++) {
            harr[x] = arr[mid + 1 + x];
        }

        int i = 0;
        int j = 0;
        int k = low;
        while (i < n1 && j < n2) {
            if (arr[i] <= harr[j]) {
                arr[k] = larr[i];
                i++;
            } else {
                arr[k] = harr[j];
                i++;
            }
            k++;
        }
    }

}
