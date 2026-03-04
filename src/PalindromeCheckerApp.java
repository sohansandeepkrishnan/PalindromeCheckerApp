import java.util.Stack;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class PalindromeCheckerApp {

    static boolean stackPalindrome(String input) {
        input = input.replaceAll("\\s+", "").toLowerCase();
        Stack<Character> stack = new Stack<>();
        for(char c : input.toCharArray()) {
            stack.push(c);
        }
        String reversed = "";
        while(!stack.isEmpty()) {
            reversed += stack.pop();
        }
        return input.equals(reversed);
    }

    static boolean dequePalindrome(String input) {
        input = input.replaceAll("\\s+", "").toLowerCase();
        Deque<Character> deque = new ArrayDeque<>();
        for(char c : input.toCharArray()) {
            deque.add(c);
        }
        while(deque.size() > 1) {
            if(deque.removeFirst() != deque.removeLast()) {
                return false;
            }
        }
        return true;
    }

    static boolean twoPointerPalindrome(String input) {
        input = input.replaceAll("\\s+", "").toLowerCase();
        int left = 0;
        int right = input.length() - 1;
        while(left < right) {
            if(input.charAt(left) != input.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter string:");
        String input = scanner.nextLine();

        long start1 = System.nanoTime();
        boolean result1 = stackPalindrome(input);
        long end1 = System.nanoTime();

        long start2 = System.nanoTime();
        boolean result2 = dequePalindrome(input);
        long end2 = System.nanoTime();

        long start3 = System.nanoTime();
        boolean result3 = twoPointerPalindrome(input);
        long end3 = System.nanoTime();

        System.out.println("Stack Result: " + result1 + " Time: " + (end1 - start1) + " ns");
        System.out.println("Deque Result: " + result2 + " Time: " + (end2 - start2) + " ns");
        System.out.println("Two Pointer Result: " + result3 + " Time: " + (end3 - start3) + " ns");

        scanner.close();
    }
}