package BasicCodes;

public class SumofDigits {
    public static void main(String[] args) {
        int number = 1234;
        int sum = sumOfDigits(number);
        System.out.println("Sum of digits: " + sum);
    }

    // Method to calculate the sum of digits of a given number
    public static int sumOfDigits(int num) {
        int sum = 0;

        // Loop until num becomes 0
        while (num > 0) {
            int digit = num % 10;  // Extract the last digit
            sum += digit;          // Add it to the sum
            num = num / 10;        // Remove the last digit
        }
        return sum;
    }
}
