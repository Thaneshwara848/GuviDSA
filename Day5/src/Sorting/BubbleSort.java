package Sorting;

public class BubbleSort {

	public static void main(String[] args) {
		
		int[] numbers = {7, 2, 6, 3, 1};
		
		System.out.println("Before sorting:");
        printArray(numbers);
        
     // Perform bubble sort
        bubbleSort(numbers);

        // Print after sorting
        System.out.println("After sorting:");
        printArray(numbers);
	}
	
	public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
	
	public static void bubbleSort(int[] arr) {
        int n = arr.length;
        // Outer loop: runs n-1 times
        for (int i = 0; i < n - 1; i++) {
            // Inner loop: goes till n-i-1
            for (int j = 0; j < n - 1 - i; j++) {
                // Compare and swap if needed
                if (arr[j] > arr[j + 1]) {
                    // Swapping values
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

}























