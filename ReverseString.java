
public class ReverseString {
    public static void main(String[] args) {
        String text = "Hello World";
        String reversed = "";

        for (int i = text.length() - 1; i >= 0; i--) {
            reversed = reversed + text.charAt(i);
        }

        System.out.println("Original String: " + text);
        System.out.println("Reversed String: " + reversed);
    }
}
