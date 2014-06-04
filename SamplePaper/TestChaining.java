package SamplePaper;

/**
 * Created with IntelliJ IDEA.
 * User: liliya
 * Date: 04/06/14
 * Time: 22:16
 * To change this template use File | Settings | File Templates.
 */
public class TestChaining {

        public static void main(String[] args) {
            Aa a = new B();
            a.incr(10);
            System.out.println(a);
        }
}
