package VogellaConcurrencyTutorial;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * Created with IntelliJ IDEA.
 * User: liliya
 * Date: 05/06/14
 * Time: 15:24
 * To change this template use File | Settings | File Templates.
 */
public class MainExecutor {

    private static final int NTHRDS=10;

    public static void main(String [] args){

        ExecutorService executor= Executors.newFixedThreadPool(NTHRDS);

        for(int i=0; i<500;i++){
            Runnable worker=new MyRunnable(10000000L + i);
            executor.execute(worker);
        }

        executor.shutdown();
        try{
        executor.awaitTermination(1000, TimeUnit.MILLISECONDS);
        } catch(InterruptedException ex){
            ex.printStackTrace();
        }
        System.out.println("execution finished");

    }
}
