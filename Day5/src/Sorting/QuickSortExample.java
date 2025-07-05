package Sorting;

public class QuickSortExample {

    public static void main(String[] args) {
        int[] arr = {10, 7, 8, 9, 1, 5};

        System.out.println("Before sorting:");
        printArray(arr);

        quickSort(arr, 0, arr.length - 1);

        System.out.println("After sorting:");
        printArray(arr);
    }

    // Quick Sort Function
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            // pi is the partition index
            int pi = partition(arr, low, high);

            // Recursively sort left and right parts
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    // Partition Function
    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];  // Last element as pivot
        int i = low - 1;         // Index of smaller element

        for (int j = low; j < high; j++) {
            // If current element is smaller than or equal to pivot
            if (arr[j] <= pivot) {
                i++;

                // Swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Swap pivot with arr[i+1]
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1; // Return pivot index
    }

    // Utility method to print array
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
