package Concurrency;

import java.net.URL;
import java.net.URLConnection;
import java.util.concurrent.Semaphore;
import java.io.IOException;

public class ConnectionLimiter {

    private final Semaphore semaphore;

    public ConnectionLimiter(int maxConcurrentRequests){
        //initialize semaphore with a value of maximum allowed concurrent request
        semaphore=new Semaphore(maxConcurrentRequests);
    }

    public URLConnection acquire(URL url) throws InterruptedException, IOException{
        //calls to acquire block until permits are available
        semaphore.acquire();
        return url.openConnection();
    }

    public void release(URLConnection conn){
        try{

        } finally{
            //releasing the semaphore after the it has been used
            semaphore.release();
        }
    }
}
