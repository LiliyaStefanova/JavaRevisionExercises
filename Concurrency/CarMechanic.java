package Concurrency;

/**
 * Created with IntelliJ IDEA.
 * User: liliya
 * Date: 10/06/14
 * Time: 19:46
 * To change this template use File | Settings | File Templates.
 */
public class CarMechanic implements Runnable {

    CarQueueClass q;

    public CarMechanic(CarQueueClass q){
        //threads are created with a new instance of this class that implements runnable
        this.q=q;
        new Thread(this, "Car mechanic").start();
    }
    @Override
    public void run() {
        for(int i=0; i<5; i++){
            q.get();
        }
    }
}
