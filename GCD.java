
public class GCD {
    public static void main(String[] args) {
        int num1 = 12;
        int num2 = 18;

        while (num2 != 0) {
            int temp = num2;
            num2 = num1 % num2;
            num1 = temp;
        }

        System.out.println("GCD: " + num1);
    }
}
