import java.util.Deque;
import java.util.LinkedList;

public class UseCase7PalindromeCheckerApp {
    public static void main(String[] args) {
        String word = "racecar";

        Deque<Character> deque = new LinkedList<>();
        for (int i = 0; i < word.length(); i++) {
            deque.addLast(word.charAt(i));
        }

        boolean isPalindrome = true;
        while (deque.size() > 1) {
            if (!deque.removeFirst().equals(deque.removeLast())) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println(word + " is a Palindrome.");
        } else {
            System.out.println(word + " is NOT a Palindrome.");
        }
    }
}
