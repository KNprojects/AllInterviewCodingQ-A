package main.java.FizzBuzzProg;

import java.util.stream.IntStream;

public class FizzBuzzExample {
/*
    This is a multiplayer game. When your turn comes then you have to say one number.
    If the number is multiple of 5 then you have to say "Fizz" in the french ascent.
    If the number is multiple of 7 then say "Buzz".
    If the number is multiple of 5 and 7 then say "FizzBuzz".
    If you can not say the right word for your number then you are out of the game.
    So must have to say the correct fizz buzzword to continue the game otherwise game will be continued without you.
    Whoever is alone in the game that person is the winner
    */public static void main(String[] args) {

        int limit=10;

        int cuurentNumb=0;

        while (cuurentNumb <= limit) {

            if (cuurentNumb % 5 == 0 && cuurentNumb % 7 ==0 ) {
                System.out.println("Fizz Buzz");
            }


            else if (cuurentNumb % 5 == 0) {
                System.out.println("Fizz");
            }

            else if (cuurentNumb % 7 == 0 ) {
                System.out.println("Buzz");

            }
            else {
                System.out.println(cuurentNumb);

            }

            cuurentNumb ++;


        }

    // IntStream to generate the numbers range from 1 to 100 and mapToObj() to get the right fizz buzz word.
    int currentNumber=1;
    System.out.println("========================================================================");
    IntStream.rangeClosed(currentNumber, limit)
            .mapToObj(i -> i % 5 == 0 ? (i % 7 == 0 ? "FizzBuzz" : "Fizz") : (i % 7 == 0 ? "Buzz" : i))
            .forEach(System.out::println);
}

    }

