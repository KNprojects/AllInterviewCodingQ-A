package main.java.java8CodingQues;

import java.util.ArrayList;
import java.util.List;

public class PeekExample {

    public static void main(String[] args) {
        List<String> names= new ArrayList<>();
        names.add("David");
        names.add("john");
        names.add("kenval");
        names.add("karthik");
        names.add("Johnson");
        names.add("Samontika");
        names.add("Brijesh");

        names.stream()
                .filter(name-> name.length()>5)
                .peek(e->System.out.println("Filtered Name: "+e))
                .map(String::toUpperCase)
                .peek(e->System.out.println("Mapped Name : "+e))
                .toArray();

    }
}
