package main.java.org.example;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class OccurenceOfStringCharacter {

    public static void main(String[] args) {


        String input = "nnihaarrikaakarripee";
        //convert the string to array
              Map<String ,Long> map=Arrays.stream(input.split(""))
                      .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
              System.out.println("occurence elements in String::" +map);

              /* find all the duplicate elements in string*/
        List<String> duplicates = Arrays.stream(input.split(""))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream()
                .filter(k -> k.getValue() > 1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
        System.out.println("Duplicates Elements in String::" + duplicates);

/* unique elements in string same approach with one change*/
        List<String> uniqueelements= Arrays.stream(input.split(""))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream()
                .filter(k -> k.getValue()==1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
        System.out.println("unique Elements in String::" + uniqueelements);



    }

}
