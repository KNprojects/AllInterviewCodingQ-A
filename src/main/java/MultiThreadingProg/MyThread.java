package main.java.MultiThreadingProg;

public class MyThread  extends Thread{

    public static void main(String[] args) {
        Thread thread=new Thread();
        int priority=thread.getPriority();
        System.out.println(priority);

        thread.setPriority(Thread.MAX_PRIORITY);
        priority=thread.getPriority();
        System.out.println(priority);


        Thread t1=new Thread();
        t1.setName("NIHA");
        //int tp=t1.getPriority();
        String name=t1.getName();
        System.out.println(t1);
       // System.out.println(tp);
    }





}
