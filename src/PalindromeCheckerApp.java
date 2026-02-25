public class PalindromeCheckerApp {
    public static void main(String[] args) {

        String word = "radar";
        char[] characters = word.toCharArray();
        int left = 0;
        int right = characters.length - 1;

        boolean isPalindrome = true;
        while (left < right) {

            if (characters[left] != characters[right]) {
                isPalindrome = false;
                break;
            }
            left++;
            right--;
        }
        if (isPalindrome) {
            System.out.println(word + " is a Palindrome");
        } else {
            System.out.println(word + " is NOT a Palindrome");
        }
    }
}

