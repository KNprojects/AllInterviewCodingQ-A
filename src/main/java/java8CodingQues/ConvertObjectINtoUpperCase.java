package main.java.java8CodingQues;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ConvertObjectINtoUpperCase {
    public static void main(String[] args) {
        String s="niharika";
        List<String> list=Arrays.asList(s).stream().map(String::toUpperCase).collect(Collectors.toList());
        System.out.println("InUpperCase :: "+list);

    }
}
