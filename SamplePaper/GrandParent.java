package SamplePaper;

/**
 * Created with IntelliJ IDEA.
 * User: liliya
 * Date: 04/06/14
 * Time: 19:41
 * To change this template use File | Settings | File Templates.
 */

    public abstract class GrandParent {
        private final static int HowMuch = 100;
        public abstract boolean good();
        public static int getMore() {
            return HowMuch;
        }
        public void eat() {
            if (good())
            System.out.println("Good!");
            else
            System.out.println("Bad!");
        }
    }

