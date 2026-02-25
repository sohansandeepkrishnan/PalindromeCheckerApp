public class PalindromeCheckerApp {
    public static void main(String[] args) {

        String word = "level";

        Queue<Character> queue = new LinkedList<>();
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            queue.add(ch);   // Enqueue
            stack.push(ch);  // Push
        }
        boolean isPalindrome = true;
        while (!queue.isEmpty()) {

            char fromQueue = queue.remove();  // FIFO
            char fromStack = stack.pop();     // LIFO

            if (fromQueue != fromStack) {
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