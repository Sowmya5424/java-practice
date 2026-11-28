
public class ElementFrequency {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 10, 30, 20, 10};

        for (int i = 0; i < numbers.length; i++) {
            boolean alreadyCounted = false;

            // Check whether the element was counted before
            for (int k = 0; k < i; k++) {
                if (numbers[i] == numbers[k]) {
                    alreadyCounted = true;
                    break;
                }
            }

            if (!alreadyCounted) {
                int count = 0;

                // Count occurrences of the current element
                for (int j = 0; j < numbers.length; j++) {
                    if (numbers[i] == numbers[j]) {
                        count++;
                    }
                }

                System.out.println(numbers[i] + " occurs " + count + " times");
            }
        }
    }
}
