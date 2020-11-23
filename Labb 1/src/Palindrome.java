import java.util.Scanner;
public class Palindrome {

    public Palindrome(){

    }

    public static  void main(String[] args){
        Scanner scaner = new Scanner(System.in);
        System.out.println(isPalindrome(scaner.nextLine()));
    }

    public static String reverseString(String s2) {
        StringBuilder sb = new StringBuilder();

        for(int i = s2.length() - 1; i >= 0; --i) {
            sb.append(s2.charAt(i));
        }

        return sb.toString();
    }

    public static boolean isPalindrome(String s1) {
        return s1.equals(reverseString(s1));
    }

}
