package assignments.lab;

public class lab05 {
    public static int reverse(int number) {
        String num = Integer.toString(number);
        String reverseNum = "";
        char ch;
        for (int i = 0; i < num.length(); i++) {
            ch = num.charAt(i);
            reverseNum = ch + reverseNum;
        }
        return Integer.parseInt(reverseNum);
    }

    public static boolean isPalindrome(int number) {
        if (number == reverse(number))
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(12344321));
    }
}