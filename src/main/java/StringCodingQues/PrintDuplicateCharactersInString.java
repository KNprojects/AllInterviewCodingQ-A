package main.java.StringCodingQues;

import java.util.Map;
import java.util.stream.Collectors;

public class PrintDuplicateCharactersInString {

    public static void main(String[] args) {
        // given input string
        String input = "JavaJavaEE";

        // convert string into stream
        Map< Character, Long > result = input
                .chars().mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()));

        result.forEach((k, v) -> {
            if (v > 1) {
                System.out.println(k + " : " + v);
            }
        });
    }
    }



