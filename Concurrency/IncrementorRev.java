package Concurrency;

/**
 * Created with IntelliJ IDEA.
 * User: liliya
 * Date: 26/05/14
 * Time: 13:46
 * To change this template use File | Settings | File Templates.
 */
public class IncrementorRev implements Runnable {

    CounterRev c;



    public IncrementorRev(CounterRev c){

        this.c=c;

    }

    public static void main(String args []){
        CounterRev c=new CounterRev();
        IncrementorRev incr=new IncrementorRev(c);
        for(int i=0; i<100;i++){
            Thread newThread=new Thread(incr);
            newThread.start();
        }

    }

    //no point synchronizing in run as every thread has its own stack
    @Override
    public void run() {

        System.out.println("Starting at..."+c.getCount());

        for(int i=0; i<1000; i++){
            c.increase();
        }
        System.out.println("Stopping at "+ c.getCount());
    }


}
