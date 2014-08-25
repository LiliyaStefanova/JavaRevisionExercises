package Concurrency;

/**
 * Created with IntelliJ IDEA.
 * User: liliya
 * Date: 10/06/14
 * Time: 19:36
 * To change this template use File | Settings | File Templates.
 */
//thread to execute the class car queue methods

public class CarOwner implements Runnable {

    CarQueueClass q;
    CarOwner( CarQueueClass q){
        this.q=q;
        new Thread(this, "Car owner").start();
    }


    @Override
    public void run() {
        int count=0;
        try{
            while(count<5){
                Thread.sleep(2000);
                q.put(++count);
            }
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }

