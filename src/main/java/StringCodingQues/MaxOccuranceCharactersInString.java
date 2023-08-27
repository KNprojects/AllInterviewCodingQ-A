package main.java.StringCodingQues;

import java.util.Comparator;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MaxOccuranceCharactersInString {
    public static void main(String[] args) {
      Scanner in = new Scanner(System.in);

        String input = in.nextLine();

        System.out.println(input.chars()
                .mapToObj(x -> (char) x)
                .collect(Collectors.groupingBy(x -> x, Collectors.counting()))
                .entrySet()
                .stream()
                .max(Comparator.comparingLong(Map.Entry::getValue))
                .get());
    }



}
