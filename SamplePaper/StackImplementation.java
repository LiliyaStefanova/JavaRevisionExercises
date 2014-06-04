package SamplePaper;

import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: liliya
 * Date: 04/06/14
 * Time: 20:58
 * To change this template use File | Settings | File Templates.
 */
public class StackImplementation<E> implements Stack<E> {

    private List<E> stack=new ArrayList<E>();

    @Override
    public boolean isEmpty() {
        if(stack.isEmpty()){
            return true;
        }
        else{
            return false;
        }
    }

    @Override
    public E peek() {
        if(isEmpty()){
            throw new EmptyStackException();
        }
       return stack.get(stack.size()-1);
    }

    @Override
    public E pop() {
        if(isEmpty()){
            throw new EmptyStackException();
        }
        E popped=stack.get(stack.size()-1);
        stack.remove(stack.size()-1);
        return popped;
    }

    @Override
    public void push(E item) {
        stack.add(item);
    }

    public static void main(String [] args){

        Stack<Integer> newStack=new StackImplementation<Integer>();
        //newStack.pop();
        newStack.push(5);
        newStack.push(7);
        newStack.push(9);
        newStack.push(10);
        newStack.pop();
        System.out.println(newStack.peek());

    }
}
