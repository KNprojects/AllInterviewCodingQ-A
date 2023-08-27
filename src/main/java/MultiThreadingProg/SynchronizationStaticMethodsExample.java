package main.java.MultiThreadingProg;

public class SynchronizationStaticMethodsExample {
    static int bal=100;
    int amt=10;
    synchronized static void deposite(int amt){
        bal=bal+amt;
        System.out.println(bal);
    }

    public static void main(String[] args) {

        SynchronizationStaticMethodsExample sr=new SynchronizationStaticMethodsExample();
        sr.deposite(222);
       // System.out.println(sr);
            }
}
