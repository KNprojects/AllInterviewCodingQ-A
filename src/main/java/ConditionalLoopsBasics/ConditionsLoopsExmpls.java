package main.java.ConditionalLoopsBasics;

public class ConditionsLoopsExmpls {
    public static void main(String[] args) {

        /*
        //syntax for if statements
        if(boolean expression T or F){
            //body
        }else{
         do this
        }
        */

        int salary=25400;
      /*  if (salary > 10000){
            salary=salary + 2000;
        }else{
            salary =salary+1000;
        }
        System.out.println(salary);

    }*/

    //multiple if else statements

    if(salary>10000){
        salary +=2000;
    } else if (salary<15000) {
        salary+=10000;
    }else {
        salary+=5000;
    }
        System.out.println(salary);
    }

}
