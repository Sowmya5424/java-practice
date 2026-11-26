
public class MissingNumber {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 5};

        int n = 5;

        int total = n * (n + 1) / 2;
        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];
        }

        int missingNumber = total - sum;

        System.out.println("Missing number: " + missingNumber);
    }
}
