package main.java.MultiThreadingProg;

public class RunMethodAndStartMethodProg extends Thread{


    public static void main(String[] args)  {

        Thread t1=new Thread();
        t1.start();
       // Thread.sleep(1000);
        Thread t2=Thread.currentThread();
        t2.start();



    }

}
