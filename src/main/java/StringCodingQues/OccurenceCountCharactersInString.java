package main.java.StringCodingQues;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class OccurenceCountCharactersInString {


    public static Map<Character, Long> countCharacters(String input) {
        return input.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
    }

    public static void main(String[] args) {
        String input = "Be positive Always!!!!";
        Map<Character, Long> charCountMap = countCharacters(input);

        // Print the character count for each character
        charCountMap.forEach((character, count) ->
                System.out.println("'" + character + "' occurs " + count + " time(s)."));
    }





}
