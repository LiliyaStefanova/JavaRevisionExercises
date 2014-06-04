package SamplePaper;

/**
 * Created with IntelliJ IDEA.
 * User: liliya
 * Date: 04/06/14
 * Time: 22:15
 * To change this template use File | Settings | File Templates.
 */
public class B extends Aa {

        int i;

        @Override
        public void incr(int d){
            if (d > 0)  {
                this.i += d;
                super.incr(d/2);
            }
        }

        @Override
        public String toString() {

            return super.toString() + " B’s i is: " + i;
        }
    }

