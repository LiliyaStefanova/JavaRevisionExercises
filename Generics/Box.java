package Generics;

//this is a genericized class with a type parameter of T specified
public class Box<T> {

    //all variables in the class must be of the same type
    private T t;

    //all params taking in an object of this type
    public void add(T t){
        this.t=t;
    }

    public T get(){
        return t;
    }

    public static void main(String [] args){

        //cannot use just <>, must specify the type
        Box<Integer> integerBox=new Box<Integer>();
        Box<String> stringBox=new Box<String>();
        //cannot used primitives; boxed types are required by generics
        integerBox.add(new Integer(10));
        integerBox.add(12); //this automatically gets boxed
        stringBox.add(new String("Hello World"));

        System.out.printf("Integer Value :%d\n\n", integerBox.get());
        System.out.printf("String Value :%s\n", stringBox.get());

    }
}
