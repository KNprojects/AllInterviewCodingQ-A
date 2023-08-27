package main.java.java8CodingQues;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindEvenNoInList {

    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(10,15,78,9856,98,90,9);
        list.stream().map(e->e%2==0).forEach(System.out::println);
    }

}
