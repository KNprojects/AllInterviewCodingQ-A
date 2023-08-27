package main.java.org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class DupllicateNoinArrayJava8 {
    public static void main(String[] args) {




   /*// int[] arr = {1, 2, 3, 4, 2, 5, 6, 7, 3, 8, 9, 5};

    List<Integer> list=new Arrays.stream("1, 2, 3, 4, 2, 5, 6, 7, 3, 8, 9, 5");
    list.stream().boxed().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
            .entrySet()
            .stream()
            .filter( p -> p.getValue() > 1 )
            .map(Map.Entry::getKey);
    System.out.println(list);*/

    List<Integer> duplicates = IntStream.of( 1, 2, 3, 2, 1, 2, 3, 4, 2, 2, 2 )
            .boxed()
            .collect( Collectors.groupingBy( Function.identity(), Collectors.counting() ) )
            .entrySet()
            .stream()
            .filter( p -> p.getValue() > 1 )
            .map( Map.Entry::getKey )
            .collect( Collectors.toList() );
        System.out.println(duplicates);

        System.out.println("=======================");


        int[] arr = {1,1,2,3,4,5};

        String duplicates2 = Arrays.stream(arr)
                .boxed()
                .collect(Collectors.groupingBy(e->e,Collectors.counting()))
                .entrySet()
                .stream()
                .filter(e -> e.getValue() > 1)
                .map(e -> e.getKey().toString())
                .collect(Collectors.joining(", "));

        System.out.println("Duplicates: " + duplicates2);






    }
}
