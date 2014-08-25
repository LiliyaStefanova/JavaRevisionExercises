package Concurrency;

import java.util.concurrent.Semaphore;

public class SemaphoreTest {

    Semaphore binary=new Semaphore(1);

    public static void main(String [] args){

        final SemaphoreTest test=new SemaphoreTest();
        for(int i=0; i<5;i++){
        new Thread(){
            @Override
            public void run(){
                test.mutualExclusion();
            }
        }.start();
    }

    }

    public void mutualExclusion(){

        try{
            binary.acquire();
            //mutual exclusive region
            System.out.println(Thread.currentThread().getName()+ " inside mutual exclusion region");
            Thread.sleep(1000);
        }catch(InterruptedException ex){
            ex.printStackTrace();
        }finally {
            binary.release();
            System.out.println(Thread.currentThread().getName()+" outside " +
                    "of mutual exclusive region");
        }
    }
}
