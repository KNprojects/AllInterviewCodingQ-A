package main.java.java8CodingQues;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindFirstElementInList {

    public static void main(String[] args) {
        List<Integer> mylist= Arrays.asList(111,10,32,78,23,53,23,34);
        mylist.stream().findFirst().ifPresent(System.out::println);

        List<String> list=Arrays.asList("javac","j2ee","jdbc");
        System.out.println(list);
        list.stream().findFirst().ifPresent(System.out::println);


    }


}
