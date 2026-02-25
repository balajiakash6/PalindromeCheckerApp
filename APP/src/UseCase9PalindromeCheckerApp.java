public class UseCase9PalindromeCheckerApp {

    public static boolean isPalindrome(String word, int start, int end) {
        if (start >= end) return true;
        if (word.charAt(start) != word.charAt(end)) return false;
        return isPalindrome(word, start + 1, end - 1);
    }

    public static void main(String[] args) {
        String word = "racecar";
        if (isPalindrome(word, 0, word.length() - 1)) {
            System.out.println(word + " is a Palindrome.");
        } else {
            System.out.println(word + " is NOT a Palindrome.");
        }
    }
}
