package main.java.StringCodingQues;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicates {

    public static void main(String[] args) {
        List<Integer> list=Arrays.asList(10,88,20,49,58,89,88,88,88);
        System.out.println("Duplicates with out remove"+list);

        List<Integer> withoutduplis=list.stream().distinct().collect(Collectors.toList());
        System.out.println("after removing duplicates"+withoutduplis);


    }


}
