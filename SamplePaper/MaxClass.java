package SamplePaper;

/**
 * Created with IntelliJ IDEA.
 * User: liliya
 * Date: 04/06/14
 * Time: 18:21
 * To change this template use File | Settings | File Templates.
 */
public class MaxClass {

        public static void main(String args[]) {
            try {
                C c = new C();
                System.out.println(c.max(13, 29));
            } catch (RuntimeException rte) {
                System.out.println(rte);
            } finally {
                System.out.println("In finally of main");
            }
        }
    }



