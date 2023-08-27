package main.java.StringCodingQues;

public class PalindromeString {

    public static void main(String[] args) {
        System.out.println("Is aaa Palindrome?:::" + isPalindromeString("aaa"));
        System.out.println("Is aaa Palindrome?:::" + isPalindromeString("abc"));


    }

    private static boolean isPalindromeString(String text) {
        String reverse=reverse(text);
        if ( text.equals(reverse)){
            return  true;
        }
        return false;
    }

    private static String reverse(String input){
        if(input == null || input.isEmpty()){
            return input;
        }
        return input.charAt(input.length()- 1) + reverse(input.substring(0, input.length() - 1));
    }
}
