
public class MergeArrays {
    public static void main(String[] args) {
        int[] array1 = {10, 20, 30};
        int[] array2 = {40, 50, 60};

        int[] mergedArray = new int[array1.length + array2.length];

        for (int i = 0; i < array1.length; i++) {
            mergedArray[i] = array1[i];
        }

        for (int i = 0; i < array2.length; i++) {
            mergedArray[array1.length + i] = array2[i];
        }

        System.out.println("Merged Array:");

        for (int i = 0; i < mergedArray.length; i++) {
            System.out.print(mergedArray[i] + " ");
        }
    }
}
