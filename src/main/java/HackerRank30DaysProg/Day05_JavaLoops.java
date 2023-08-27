package main.java.HackerRank30DaysProg;

import java.util.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int x=1;
            int temp=a;

            for(int j=1;j<=n;j++){
                temp+=(x*b);
                System.out.print(temp+" ");
                x*=2;
            }
            System.out.println();

        }
        in.close();
    }
}