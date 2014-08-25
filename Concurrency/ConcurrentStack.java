package Concurrency;

public class ConcurrentStack {


    private class Element{
        int info;
        Element next;
        Element(int n, Element e){ info=n; next=e;}
    }

    private Element first;
    public ConcurrentStack(){ first=null;}

    public synchronized void push(int n){
        first=new Element(n, first);
        //if the stack was empty notify the consumers
        if(first.next==null){
            notifyAll();
        }
    }

    public synchronized int pop(){
        try{
            //wait while the stack is empty
            while(first==null){
                wait();
            }
            } catch(InterruptedException ex){
                return 1;
            }
            int n=first.info;
            first=first.next; //reset the link to the next one in the stack
            return n;
        }

        public synchronized boolean isEmpty(){
            return first==null;
    }

}