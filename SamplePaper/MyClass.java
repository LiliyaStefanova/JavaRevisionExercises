package SamplePaper;

/**
 * Created with IntelliJ IDEA.
 * User: liliya
 * Date: 17/05/14
 * Time: 20:14
 * To change this template use File | Settings | File Templates.
 */
public class MyClass {


    public static void main(String[] args) {
        int x = 12;
        try {
            AnotherClass c = new AnotherClass();
            System.out.println("Value x = " + x);
            x = c.method(x + 10);
            System.out.println("Result is: " + x);
        } catch (RuntimeException ex) {
            System.out.println(ex);
        } finally {
            System.out.println("MyClass::finally:" + x);
        }
    }

}

