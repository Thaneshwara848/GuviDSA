package Searching;

public class BinarySearchExample {
    public static int binarySearch(int[] arr, int key) {
        int low = 0, high = arr.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] == key)
                return mid;
            else if (arr[mid] < key)
                low = mid + 1;
            else
                high = mid - 1;
        }

        return -1;  // Element not found
    }

    public static void main(String[] args) {
        int[] sortedArray = {5, 10, 15, 20, 25, 30};
        int key = 25;

        int result = binarySearch(sortedArray, key);
        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found.");
        }
    }
}
