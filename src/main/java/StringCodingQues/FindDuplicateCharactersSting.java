package main.java.StringCodingQues;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindDuplicateCharactersSting {
    public static void main(String[] args) {

        // example : “Better Butter”, duplicate characters and their count is t : 4, e : 3, r : 2 and B : 2.
        //using java 8
        String str = "Better Butter";
        Map<Character, Long> duplicates = str.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        duplicates.entrySet().stream()
                .filter(entry -> entry.getValue() > 1)
                .forEach(entry -> System.out.println(entry.getKey() + " - " + entry.getValue()));


        //without java 8

        HashMap<Character,Integer> charCountMap=new HashMap<Character,Integer>();
        //convert string to char array
        char[] strArray = str.toCharArray();
        //check each cahr of strArray
        for(char c: strArray){
            if (charCountMap.containsKey(c)){
                charCountMap.put(c,charCountMap.get(c)+1);
            }else{
                charCountMap.put(c,1);
            }

            Set<Character> charsInString = charCountMap.keySet();

            System.out.println("Duplicate Characters In "+str);

            //Iterating through Set 'charsInString'

            for (Character ch : charsInString)
            {
                if(charCountMap.get(ch) > 1)
                {
                    //If any char has a count of more than 1, printing it's count

                    System.out.println(ch +" : "+ charCountMap.get(ch));
                }
            }

        }

        System.out.println("Duplicates : " +duplicates);

        System.out.println("CharsCountzMap : " +charCountMap);
    }

    }

