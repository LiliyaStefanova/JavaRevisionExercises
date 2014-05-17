package Generics;


public class GenericStack<T extends Number> {

    private T [] stack;
    private int headIndex;

    public GenericStack(){
        headIndex=0;
    }

    public void push(T element){
        stack[headIndex]=element;
        headIndex++;
    }

    public T pop(){

        if(headIndex==0){
            return null;
        }
        else{
            headIndex--;
            T result= stack[headIndex];
            stack[headIndex]=null;
            return result;
        }

    }

    public boolean isEmpty(){

        return stack.length==0;
    }

    public static void main(String [] args){

        GenericStack<Integer> integerStack= new GenericStack<Integer>();
        GenericStack<Double> doubleStack=new GenericStack<Double>();
        //can't do as it is constrained by number
      //  GenericStack<String> stringStack= new GenericStack<String>();
    }
}
