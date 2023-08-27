package main.java.java8CodingQues;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DuplicatesInList {


    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(111,2222,333,444,333,2222,111,11,2,3,5,6);
        System.out.println("Before duplicates:::" +list);
        Set<Integer> duplicates=new HashSet<>();
        list.stream().filter(e->!duplicates.add(e)).forEach(System.out::println);

    }
}
