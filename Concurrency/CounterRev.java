package Concurrency;

/**
 * Created with IntelliJ IDEA.
 * User: liliya
 * Date: 26/05/14
 * Time: 13:45
 * To change this template use File | Settings | File Templates.
 */
public class CounterRev {

    Object obj=new Object();

    private int n=0;


    public void increase(){
        synchronized (obj){
        n++;
        }
    }

    public int getCount(){
        return n;
    }


}
