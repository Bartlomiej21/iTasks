public class Task1 {

    /*
    TODO: check if number is a palindrome
     */
    public static void main(String[] args) {
        isPalindrome(123);
        isPalindrome(123588);
        isPalindrome(12321);
        isPalindrome(123454321);
    }

    public static void isPalindrome(int a) {
        boolean isPalindrome = solution(a);
        if (isPalindrome) {
            System.out.println(a + " is a palindrome");
        } else {
            System.out.println(a + " is not a palindrome");
        }
    }

    public static boolean solution(int a) {
        String number = String.valueOf(a);
        int l = 0;
        int r = number.length() - 1;
        while (l<r) {
            if (number.charAt(l) != number.charAt(r)) {
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
}
