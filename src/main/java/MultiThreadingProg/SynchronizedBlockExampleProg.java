package main.java.MultiThreadingProg;

public class SynchronizedBlockExampleProg {
    void desposite(int amt)//p an instance
    {

    }
}
class Account extends SynchronizedBlockExampleProg {
    int bal=1000;
    public void deposit (int amt)
    {
        synchronized (this)
        {
            bal=bal+amt;
            System.out.println (bal);
        }
    }


    public static void main(String[] args) {
        Account account=new Account();
        account.deposit(111);
    }
}

