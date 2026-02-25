import java.util.Deque;
import java.util.LinkedList;

    public class PalindromeCheckerApp {

        public static void main(String[] args) {

            String word = "racecar";

            Deque<Character> deque = new LinkedList<>();
            for (int i = 0; i < word.length(); i++) {
                deque.addLast(word.charAt(i));
            }

            boolean isPalindrome = true;
            while (deque.size() > 1) {

                char front = deque.removeFirst();
                char rear = deque.removeLast();

                if (front != rear) {
                    isPalindrome = false;
                    break;
                }
            }
            if (isPalindrome) {
                System.out.println(word + " is a Palindrome");
            } else {
                System.out.println(word + " is NOT a Palindrome");
            }
        }
    }