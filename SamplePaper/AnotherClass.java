package SamplePaper;

/**
 * Created with IntelliJ IDEA.
 * User: liliya
 * Date: 17/05/14
 * Time: 20:19
 * To change this template use File | Settings | File Templates.
 */
public class AnotherClass {

    public int method(int x) {

        try {
            if (x / 2 > 10) {
                x++;

                throw new RuntimeException("Conditional: " + x);
            }
            System.out.println("AnotherClass:: Value of x is " + x);
        } catch (RuntimeException ex) {
            System.out.println("In exception x = " + x);
            //throw new IllegalArgumentException("AnotherClass::Method exception - " + ex.getMessage());
            return x;
        } catch (Exception e) {
            System.out.println("In general exception");
            throw new RuntimeException("From exception");
        } finally {

            x -= 15;
            System.out.println("AnotherClass:: " + x);
            return x;

        }
      //  return x;
    }
}



