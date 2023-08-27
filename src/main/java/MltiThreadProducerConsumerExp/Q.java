package main.java.MltiThreadProducerConsumerExp;

public class Q {
    int n;
    boolean valset;
    synchronized void put(int i){
        try {
            if (valset) {
            wait();
            }
        }catch (InterruptedException e){
            System.out.println(e);
        }

        n=i;
        System.out.println("PUT = :::"+i);
        boolean valset=true;
        notify();
        }

        synchronized int get(){
            try
            {
                if (!valset)
                {
                    wait ();
                }
            }
            catch (InterruptedException ie)
            {
                System.out.println (ie);
            }
            System.out.println ("GET="+n);
            valset=false;
            notify ();
            return (n);
        }// get
    }
class Producer implements Runnable{
     Q q;
    Thread t;
    Producer (Q q)
    {
        this.q=q;
        t=new Thread (this, "Producer");
        t.start ();
    }
    public void run(){
        int i=0;
        System.out.println ("NAME OF THE THREAD = "+t.getName ());
        while (true)
        {
            q.put (++i);
        }

    }

}


class Consumer implements Runnable{
    Q q;
    Thread t;

    public Consumer(Q q) {
        this.q = q;
        t = new Thread(this, "Consumer");
        t.start();
    }
        public void run () {
            System.out.println ("NAME OF THE THREAD = "+t.getName ());
            while (true)
            {
                int i=q.get ();
            }
        }
    }

class PCDemo
{
    public static void main (String [] args)
    {
        Q q=new Q ();
        Producer p=new Producer (q);
        Consumer c=new Consumer (q);
    }
};// PCDemo
