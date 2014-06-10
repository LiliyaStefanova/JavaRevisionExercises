/**
 * Created with IntelliJ IDEA.
 * User: liliya
 * Date: 10/06/14
 * Time: 13:57
 * To change this template use File | Settings | File Templates.
 */
public class Rational implements RationalInf, Comparable<Rational>{

    //private static int rational=new Rational(0, d);

    private int numerator;
    private int denominator;

    public Rational(int n, int d){

        //special case-division by 0
        if(d==0){
            throw new ArithmeticException("/ by 0");
        }
        this.numerator=n;
        this.denominator=d;
    }

    @Override
    public int getNumerator() {
        return 0;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public int getDenominator() {
        return 0;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public Rational add(Rational a) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public Rational subtract(Rational a) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public Rational multiply(Rational a) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public Rational divide(Rational a) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }


    @Override
    public int compareTo(Rational o) {
        return 0;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public double toDouble() {
        return 0;  //To change body of implemented methods use File | Settings | File Templates.
    }
}



