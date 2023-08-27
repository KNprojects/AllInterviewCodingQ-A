package main.java.StringCodingQues;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StringReversal {

    public static void main(String[] args) {

        String input = "Niharika Karipe";
        String reversed = new StringBuilder(input).reverse().toString();
        System.out.println(reversed);

        // Alternatively, using Java 8 Streams
        String reversedStream = input.chars()
                .mapToObj(c -> String.valueOf((char) c))
                .collect(Collectors.joining());
        System.out.println(reversedStream);

        String input1 = "Java is best Language";

        // Using Java 8 Stream API
        String reversed1 = IntStream.range(0, input1.length())
                .mapToObj(i -> input1.charAt(input1.length() - 1 - i))
                .collect(StringBuilder::new, StringBuilder::append, StringBuilder::append)
                .toString();

        System.out.println(reversed1);


        String input2 = "Nihanth";

        // Using for loop
        StringBuilder reverse = new StringBuilder();
        for (int i = input2.length() - 1; i >= 0; i--) {
            reverse.append(input2.charAt(i));
        }

        String reversedString = reverse.toString();
        System.out.println(reversedString);



    }

}
