package main.java.MultiThreadingProg;

public class SynchronizationMethodsExample {
    int bal=100;
    int amt=10;
    synchronized void deposite(int amt){
        bal=bal+amt;
        System.out.println(bal);
    }

    public static void main(String[] args) {

        SynchronizationMethodsExample sr=new SynchronizationMethodsExample();
        sr.deposite(220);
       // System.out.println(sr);
            }
}
