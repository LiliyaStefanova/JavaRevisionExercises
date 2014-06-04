package SamplePaper;

/**
 * Question 13 from sample paper-original class named A
 * renamed to avoid duplication with another exercise
 */
public class Aa {

    int i;

    public void incr(int d) {
        if (d > 0) {
            this.i += d;
            this.incr(d - 1);
        }
    }
    @Override
    public String toString() {
        return "A’s i is: " + i;
    }
}





