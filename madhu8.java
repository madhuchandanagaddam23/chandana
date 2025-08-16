Find sum of all even numbers between 1 and 100 (use for loop).
public class SumEvenNumbers {
public static void main(String[] args) {
        int sum = 0;

        // Loop from 1 to 100
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) { // Check even
                sum += i;
            }
        }

        System.out.println("Sum of even numbers between 1 and 100 is: " + sum);
    }
} 