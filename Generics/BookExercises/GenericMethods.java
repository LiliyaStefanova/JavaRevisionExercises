package Generics.BookExercises;

/**
 * Created with IntelliJ IDEA.
 * User: liliya
 * Date: 26/05/14
 * Time: 15:50
 * To change this template use File | Settings | File Templates.
 */
public class GenericMethods {

    public <T,A, B> void f(T x, A a, B b){
        System.out.println(x.getClass().getName()+" "+a.getClass().getName()+ " "+b.getClass().getName());
    }

    public static void main(String [] args){

        GenericMethods gm=new GenericMethods();
        gm.f("Lava", 1, 1.01);
        gm.f('a', 3.2, "java");
    }
}
