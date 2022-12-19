package Module4;


import java.util.Scanner;

public class M4Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string to check whether it is Palindrome or not");
        String input = scanner.nextLine();

        if (isPalindrome(input)) {
            System.out.println(input + "  is a Palindrome string");
        } else {
            System.out.println(input + "  is not a Palindrome string");
        }
    }

    public static boolean isPalindrome(String str) {
        int left = 0, right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }


}
