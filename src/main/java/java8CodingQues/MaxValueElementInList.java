package main.java.java8CodingQues;

import java.util.Arrays;
import java.util.List;

public class MaxValueElementInList {
    public static void main(String[] args) {
        List<Integer> mylist= Arrays.asList(22,3,2,4,56,78,98,22,56,71,9);
        int max=mylist.stream().max(Integer::compare).get();
        System.out.println(max);


        //sort the values present in list
        List<Integer> mylist1= Arrays.asList(22,3,2,4,56,78,98,22,56,71,9);
        mylist1.stream().sorted().forEach(System.out::println);

    }
}
