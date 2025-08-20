public class SegregateArray {
    public static void main(String[] args) {
        int[] arr = {0, 1, 1, 0, 0, 0, 1, 1, 0, 1};

        int left = 0, right = arr.length - 1;

        // Two-pointer approach
        while (left < right) {
            // Move left pointer if it's already 0
            while (arr[left] == 0 && left < right) {
                left++;
            }
            // Move right pointer if it's already 1
            while (arr[right] == 1 && left < right) {
                right--;
            }
            // Swap 1 on left with 0 on right
            if (left < right) {
                arr[left] = 0;
                arr[right] = 1;
                left++;
                right--;
            }
        }

        // Print segregated array
        System.out.println("Segregated Array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}