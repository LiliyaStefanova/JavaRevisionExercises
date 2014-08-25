package Concurrency;

/**
 * Created with IntelliJ IDEA.
 * User: liliya
 * Date: 10/06/14
 * Time: 19:48
 * To change this template use File | Settings | File Templates.
 */
public class CarServiceDemo {

    public static void main(String [] args){

        CarQueueClass c=new CarQueueClass();

        new CarOwner(c); //this creates a new thread to get from queue
        new CarMechanic(c); //this creates a new thread to put into queue
        System.out.println("Press Ctrl+C to stop");
    }
}
