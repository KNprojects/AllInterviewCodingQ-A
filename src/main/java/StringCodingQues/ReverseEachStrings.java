package main.java.StringCodingQues;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ReverseEachStrings {

    public static void main(String[] args) {

        //Using Java 8 and inbuild methods
        String s="Have A Wonderfull life";
        String s1="Niharika Karipe";
        String reversewords=reversewords(s);
        String reversewords1=reversewords1(s1);
        System.out.println("reverseword : " + reversewords);
        System.out.println("reverseword1 : "+ reversewords1);
    }

    private static String reversewords(String s) {
    return Arrays.stream(s.split(" "))
            .map(word-> new StringBuilder(word).reverse().toString())
            .collect(Collectors.joining(" "));
    }


    //without using inbuild reverse method
    private static String reversewords1(String s1) {
     String[] words=s1.split(" ");
     StringBuilder result=new StringBuilder();
     for (String word : words){
         StringBuilder reversedWord=new StringBuilder();
         for (int i = word.length() - 1; i >= 0; i--) {
             reversedWord.append(word.charAt(i));
         }

         result.append(reversedWord).append(" ");
     }

        return result.toString().trim();
     }

     }

