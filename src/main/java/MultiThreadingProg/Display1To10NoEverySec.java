package main.java.MultiThreadingProg;

public class Display1To10NoEverySec  extends Thread {

    public void run() {
        try {
            for (int i = 1; i < 10; i++) {
                System.out.println("value of i ::: " + i);
                Thread.sleep(1000);

            }
        } catch (InterruptedException e) {
            System.out.println(e);
        }

    }
}

   class ThreadDemo{


        public static void main(String[] args) {
            Thread t1=new Thread();
            System.out.println ("IS T1 ALIVE BEFORE START = "+t1.isAlive ());
            t1.start ();
            System.out.println ("IS T1 ALIVE AFTER START = "+t1.isAlive ());
        }
    }





