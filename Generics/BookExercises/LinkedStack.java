package Generics.BookExercises;

/**
 * Created with IntelliJ IDEA.
 * User: liliya
 * Date: 26/05/14
 * Time: 15:35
 * To change this template use File | Settings | File Templates.
 */
public class LinkedStack<T> {

    private static class Node<U>{
        U item;
        Node<U> next;
        Node(){
            item=null;
            next=null;
        }
        Node(U item, Node<U> next){
            this.item=item;
            this.next=next;
        }
        boolean end(){
            return item==null && next==null;
    }

    }
    //sentinel value to indicate last value on the stack
    private Node<T> top=new Node<T>();

    public void push( T item){
        top=new Node<T>(item,top);
    }

    public T pop(){
        T result=top.item;
        if(!top.end()){
            top=top.next;
        }
        return result;
    }

    public static void main(String [] args){
        LinkedStack<String> lss=new LinkedStack<String>();
        for(String s: "Phasers on stun!".split(" ")){
            lss.push(s);
        }
        String s;
        while((s=lss.pop())!=null){

        }
    }
}
