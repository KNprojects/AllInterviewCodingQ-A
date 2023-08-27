package main.java.MultiThreadingProg;

public class PrintEvenNoInOneThreadOddNoInOtherThread extends Thread{
    public void run(){
        try{
            for (int i = 1; i <=10 ; i+=2) {

                System.out.println("VALUE OF ODD:: "+i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }

    public class PrintEvenNoInOneThreadOddNoInOtherThread1 implements Runnable{
        public void run() {
            try{
                for (int j=2;j<=10;j+=2){
                    System.out.println("VALUE OF EVEN::"+j);
                    Thread.sleep(1000);
                }
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    };
  class ThreadDemo {
       /* public static void main(String[] args) {
            Thread t1=new Thread();//Object of Thread class
            Thread t2=new Thread();//object for Runnable class
            Thread t=new Thread();//Runnable is converted into thread obj
            System.out.println ("BEFORE START T1 IS : "+t1.isAlive ());
            System.out.println ("BEFORE START T2 IS : "+t.isAlive ());
            t1.start();
            t.start();
            System.out.println ("AFTER START T1 IS : "+t1.isAlive ());
            System.out.println ("AFTER START T2 IS : "+t.isAlive ());
            try{
                t1.join();//to make thread to join together for getting performance
                t.join();
            } catch (InterruptedException e) {
                System.out.println(e);
            }

            System.out.println ("AFTER JOINING T1 IS : "+t1.isAlive ());
            System.out.println ("AFTER JOINING T2 IS : "+t.isAlive());
        }*/
    }
}


