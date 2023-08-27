package main.java.java8CodingQues;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class RepeatedCharactcersInString {
    public static void main(String[] args) {

        String str = "Better Butter";
        Map<Character, Long> duplicates = str.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        duplicates.entrySet().stream()
                .filter(entry -> entry.getValue() > 1)
                .forEach(entry -> System.out.println(entry.getKey() + " - " + entry.getValue()));
    }
}
