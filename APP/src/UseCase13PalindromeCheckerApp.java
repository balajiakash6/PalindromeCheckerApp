import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

public class UseCase13PalindromeCheckerApp {

    public static boolean checkWithStack(String input) {
        String normalized = input.replaceAll("\\s+", "").toLowerCase();
        Stack<Character> stack = new Stack<>();
        for (char ch : normalized.toCharArray()) stack.push(ch);
        for (char ch : normalized.toCharArray()) if (ch != stack.pop()) return false;
        return true;
    }

    public static boolean checkWithDeque(String input) {
        String normalized = input.replaceAll("\\s+", "").toLowerCase();
        Deque<Character> deque = new LinkedList<>();
        for (char ch : normalized.toCharArray()) deque.addLast(ch);
        while (deque.size() > 1) if (!deque.removeFirst().equals(deque.removeLast())) return false;
        return true;
    }

    public static boolean checkWithTwoPointer(String input) {
        String normalized = input.replaceAll("\\s+", "").toLowerCase();
        int start = 0, end = normalized.length() - 1;
        while (start < end) if (normalized.charAt(start++) != normalized.charAt(end--)) return false;
        return true;
    }

    public static void main(String[] args) {
        String testString = "A man a plan a canal Panama";

        long startTime, endTime;

        startTime = System.nanoTime();
        boolean stackResult = checkWithStack(testString);
        endTime = System.nanoTime();
        System.out.println("Stack Result: " + stackResult + " | Time: " + (endTime - startTime) + " ns");

        startTime = System.nanoTime();
        boolean dequeResult = checkWithDeque(testString);
        endTime = System.nanoTime();
        System.out.println("Deque Result: " + dequeResult + " | Time: " + (endTime - startTime) + " ns");

        startTime = System.nanoTime();
        boolean twoPointerResult = checkWithTwoPointer(testString);
        endTime = System.nanoTime();
        System.out.println("Two-Pointer Result: " + twoPointerResult + " | Time: " + (endTime - startTime) + " ns");
    }
}
