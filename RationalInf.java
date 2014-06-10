/**
 * Created with IntelliJ IDEA.
 * User: liliya
 * Date: 10/06/14
 * Time: 14:12
 * To change this template use File | Settings | File Templates.
 */
public interface RationalInf {

    public int getNumerator();

    public int getDenominator();

    public Rational add(Rational a);

    public Rational subtract(Rational a);

    public Rational multiply(Rational a);

    public Rational divide(Rational a);

    public int compareTo(Rational o);

    public String toString();

    public double toDouble();
}
