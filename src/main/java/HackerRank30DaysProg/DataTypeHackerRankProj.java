package main.java.HackerRank30DaysProg;

import java.util.Scanner;

public class DataTypeHackerRankProj {

    public static void main(String []argh)
    {
/*  input
        5
        -150
        150000
        1500000000
        213333333333333333333333333333333333
        -100000000000000*/


 /* -150 can be fitted in:
 short
 int
 long
    150000 can be fitted in:
 int
 long
    1500000000 can be fitted in:
 int
 long
*/


        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();

        for(int i=0;i<t;i++)
        {

            try
            {
                long x=sc.nextLong();
                if(x > Long.MAX_VALUE || x < Long.MIN_VALUE){
                    System.out.println(x+" can't be fitted anywhere.");
                }else{
                    System.out.println(x+" can be fitted in:");

                    if(x>=-128 && x<=127){
                        System.out.println("* byte");
                    }
                    //Complete the code

                    if(x>=-32768 && x<=32767){
                        System.out.println("* short");
                    }


                    if(x>=-2147483648 && x<=2147483647){
                        System.out.println("* int");
                    }

                    if(x>=Long.MIN_VALUE && x<=Long.MAX_VALUE){
                        System.out.println("* long");
                    }

                }

            }
            catch(Exception e)
            {
                System.out.println(sc.next()+" can't be fitted anywhere.");
            }

        }
    }
}
