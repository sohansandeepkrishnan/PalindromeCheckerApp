public class PalindromeCheckerApp {
    public static void main(String[] args) {

        String word = "madam";

        boolean result = isPalindrome(word, 0, word.length() - 1);

        if (result) {
            System.out.println(word + " is a Palindrome");
        } else {
            System.out.println(word + " is NOT a Palindrome");
        }
    }
    public static boolean isPalindrome(String word, int left, int right) {
        if (left >= right) {
            return true;
        }
        if (word.charAt(left) != word.charAt(right)) {
            return false;
        }
        return isPalindrome(word, left + 1, right - 1);
    }
}