package VogellaConcurrencyTutorial;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String [] args){

        List<Thread> threads= new ArrayList<Thread>();
        /**
         * 500 threads are created to perform this adding up
         */
        for(int i=0; i<500; i++){

            Runnable task=new MyRunnable(10000000L + i);
            Thread worker=new Thread(task);
            worker.setName(String.valueOf(i));
            worker.start();

            threads.add(worker);
        }
        /**
         * Keep a list of all threads activates and check if they are still running-this will allow to keep track of how
         * many threads are currently running
         */
        int running=0;
        do {
            running=0;
            for(Thread thread:threads){
                if(thread.isAlive()){
                    running++;
                }
            }
            System.out.println("We have "+running+ " threads");
        }while(running>0);

    }
}
