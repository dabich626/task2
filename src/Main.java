// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

            String text;

            public static boolean isPalindrome(String text) {
                text = text.replaceAll("\\W","");
                StringBuilder strBuilder = new StringBuilder(text);
                strBuilder.reverse();
                String invertedText = strBuilder.toString();

                return text.equalsIgnoreCase(invertedText);

            }
        }
    }
}