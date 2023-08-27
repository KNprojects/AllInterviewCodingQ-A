package main.java.HackerRank30DaysProg;

import java.util.Scanner;

public class StaticInitializerBlockHackerRank {
/*
    area of a parallelogram with breadth and height. You should read the variables from the standard input.
    If or, the output should be "java.lang.Exception: Breadth and height must be positive" without quotes.*/
/*
    Input = 1,3   Output=3
    Input = -1,3   Output=java.lang.Exception: Breadth and height must be positive*/
    static int B,H;
    static boolean flag=true;
    static Scanner sc=new Scanner(System.in);

    static{

        B=sc.nextInt();
        H=sc.nextInt();

        if(B<=0 || H<=0){
            System.out.println("java.lang.Exception:Breadth and height must be positive");
        flag=false;

        }
    }

    public static void main(String[] args) {

        if(flag){
            int area=B*H;
            System.out.println(area);
        }
    }
}
