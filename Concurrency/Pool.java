/*
package Concurrency;

import java.util.concurrent.Semaphore;

*/
/**
 * Created with IntelliJ IDEA.
 * User: liliya
 * Date: 10/06/14
 * Time: 20:11
 * To change this template use File | Settings | File Templates.
 *//*

public class Pool {

    public static final int MAX_AVAILABLE=100;

    //assign a value to the semaphore
    private final Semaphore available=new Semaphore(MAX_AVAILABLE, true);

   */
/* public Object getItem() throws InterruptedException{
        available.acquire();
        return
    }

    public void putItem() throws InterruptedException{
        if()
    }*//*


    protected Object [] items={1,2,3,4,3};
    protected boolean [] used=new boolean[MAX_AVAILABLE];

    protected synchronized Object getNextAvailableItem(){
        for(int i=0; i<MAX_AVAILABLE; ++i){
            if(!used[i]){
                used[i]=true;
                return items[i];
            }
        }
    }
}
*/
