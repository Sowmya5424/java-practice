
public class CommonElements {
    public static void main(String[] args) {
        int[] array1 = {10, 20, 30, 40, 50};
        int[] array2 = {30, 40, 60, 70, 50};

        System.out.println("Common elements:");

        for (int i = 0; i < array1.length; i++) {
            boolean found = false;

            for (int j = 0; j < array2.length; j++) {
                if (array1[i] == array2[j]) {
                    found = true;
                    break;
                }
            }

            if (found) {
                System.out.print(array1[i] + " ");
            }
        }
    }
}
