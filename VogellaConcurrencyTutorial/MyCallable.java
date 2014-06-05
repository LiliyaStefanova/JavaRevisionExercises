package VogellaConcurrencyTutorial;

import java.util.concurrent.Callable;

public class MyCallable implements Callable {

    @Override
    public Object call() throws Exception {

        long sum=0;
        for(long i=0; i<=100; i++){
            sum+=i;
        }

        return sum;
    }
}
