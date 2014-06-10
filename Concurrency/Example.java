package Concurrency;

import java.util.concurrent.*;

public class Example implements Runnable {

    private int value=0;
    //mutex is a binary semaphore
    private final Semaphore mutex=new Semaphore(1);

    public int getNextValue() throws InterruptedException{
        try{
            //semaphore is acquired
            mutex.acquire();
            //critical section-guarded by semaphore
            return value++;
        } catch(InterruptedException ex){
            ex.printStackTrace();
        }finally{
            //semaphore is released by the thread
            mutex.release();
        }

        return value;
    }

    @Override
    public void run() {
        Example ex=new Example();
        try{
            ex.getNextValue();
        } catch(InterruptedException e){
            e.printStackTrace();
        }
    }

    public static void main(String [] args){

        Thread t1=new Thread(new Example());
        Thread t2=new Thread((new Example()));

        t1.start();
        t2.start();
    }

}



