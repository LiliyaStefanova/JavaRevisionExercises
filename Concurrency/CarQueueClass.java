package Concurrency;

public class CarQueueClass {

    int n; //the number of service request

    boolean mechanic_available=false;

    synchronized int get(){
        //trying to enter critical section-block if not
        if(!mechanic_available){
            try{
                wait(5000);
            }catch(InterruptedException ex){
                System.out.println("Interrupted");
            }
            //critical section
            System.out.println("Servicing car request: "+n);
        }   mechanic_available=false;
            notify();
            return n;
    }

    synchronized void put(int n){
        if(mechanic_available){
            try{
                wait(5000);
            } catch(InterruptedException ex){
                System.out.println("Interrupted");
            }
            this.n=n;
            mechanic_available=true;
            System.out.println("Put request for car service: "+n);
            notify();
        }
    }
}
