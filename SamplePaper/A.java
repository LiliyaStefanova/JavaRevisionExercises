package SamplePaper;

/**
 * Created with IntelliJ IDEA.
 * User: liliya
 * Date: 04/06/14
 * Time: 18:22
 * To change this template use File | Settings | File Templates.
 */
class A {
    int max(int x, int y) {
        try {
            if (x > y)
                x++;
            else
                throw new Exception("Oh Dear!");
            System.out.println("A::max value of x is " + x);
        } catch (Exception ex) {
            System.out.println("In exception " + ex.getMessage());
            System.out.println("x = " + x + " y = " + y);
            return y;

        } finally {
            System.out.println("A::max finally block");
            throw new IllegalArgumentException("A::max Finally x = " + x);
        }
    }
}
