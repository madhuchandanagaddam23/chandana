import java.util.Arrays;

public class MergeSortArrays {
    public static void main(String[] args) {
        // Input arrays
        int[] arr1 = {5, 2, 1, 3, 4};
        int[] arr2 = {9, 7, 8, 6, 10};

        // Find total length
        int length = arr1.length + arr2.length;

        // Create new array to store merged elements
        int[] merged = new int[length];

        // Copy elements from arr1
        for (int i = 0; i < arr1.length; i++) {
            merged[i] = arr1[i];
        }

        // Copy elements from arr2
        for (int i = 0; i < arr2.length; i++) {
            merged[arr1.length + i] = arr2[i];
        }

        // Sort merged array
        Arrays.sort(merged);

        // Display sorted merged array
        System.out.println("Merged and Sorted Array:");
        for (int num : merged) {
            System.out.print(num + " ");
        }
    }
}