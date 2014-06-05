package VogellaConcurrencyTutorial;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableFutures {

    public static final int numThreads=10;

    public static void main(String [] args){

        ExecutorService executor= Executors.newFixedThreadPool(numThreads);
        List<Future<Long>> list=new ArrayList<Future<Long>>();
        for(int i=0; i<20000; i++){
            Callable<Long> worker=new MyCallable();
            Future<Long> submit=executor.submit(worker);
            list.add(submit);
            }

        long sum=0;
        System.out.println(list.size());
        for(Future<Long> future: list){
            try{
                sum+=future.get();
            }catch(InterruptedException ex){
                ex.printStackTrace();
            }catch(ExecutionException e){
                e.printStackTrace();
            }
            System.out.println(sum);
            executor.shutdown();
        }
    }
}
