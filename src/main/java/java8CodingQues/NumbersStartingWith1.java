package main.java.java8CodingQues;

import java.util.Arrays;
import java.util.List;

public class NumbersStartingWith1 {
    public static void main(String[] args) {

        List<Integer> mylist= Arrays.asList(111,10,32,78,23,53,23,34);
        mylist.stream().map(s->s+"").filter(s->s.startsWith("1")).forEach(System.out::println);
    }
}
