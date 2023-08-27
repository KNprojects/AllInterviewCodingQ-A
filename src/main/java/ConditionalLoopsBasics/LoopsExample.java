package main.java.ConditionalLoopsBasics;

import java.util.Scanner;

public class LoopsExample {


    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);

        //for loop syntax
        /*
        for(initialization ; condition : increment/decrement){
        body
        }

         */
        //Q : print numbers from 1 to 5
        for (int num=1;num<=5;num+=1){
            System.out.println(num);
        }
        System.out.println("***********************************");

        //print numbers from 1 to n
        Scanner sc=new Scanner(System.in);
        int n=in.nextInt();
        for (int i = 0; i <=n; i++) {
            //System.out.print(i + " ");
            System.out.println("Hello World");

        }
         System.out.println("***********************************");
       /*
        //While Loop
       Syntax : while(){
       body
       }
       */
        int num=1;
        while (num <= 5){
            System.out.println(num + "  ");
            num +=2;
        }
       /*
        //do while loop
        syntax
        do{

       }while(condition);

       */
    }
}
