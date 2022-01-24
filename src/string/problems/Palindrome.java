package string.problems;

public class Palindrome {
    public static void main(String[] args) {
        /*
          If a String is reversed and it remains unchanged, that is called Palindrome. For example, MOM,DAD,MADAM are
          Palindrome. So write java code to check if a given String is Palindrome or not.
         */
        System.out.println(Palindrome.checkPalindrome("DAD"));

    }

// Function to check if a word is palindrome

    public static boolean checkPalindrome(String word) {
        boolean result = false;
        int n = word.length();
        word = word.toLowerCase();
        for (int i = 0; i < n; i++, n--) {
            if (word.charAt(i) != word.charAt(n - 1)) {
                result = false;
            } else {
                result = true;
            }
        }
        return result;
    }
    }

