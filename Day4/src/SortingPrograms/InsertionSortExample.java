package SortingPrograms;

public class InsertionSortExample {

    public static void main(String[] args) {
        int[] arr = {85, 12, 59, 72, 51};

        System.out.println("Before sorting:");
        printArray(arr);

        insertionSort(arr);

        System.out.println("After sorting:");
        printArray(arr);
    }

    // Insertion Sort Logic
    public static void insertionSort(int[] arr) {
        int n = arr.length;

        for (int i = 1; i < n; i++) {
            int key = arr[i];  // Element to be placed
            int j = i - 1;

            // Move elements of arr[0..i-1], that are greater than key
            // to one position ahead of their current position
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }

            arr[j + 1] = key;  // Insert key at correct location
        }
    }

    // Utility method to print array
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
