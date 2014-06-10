
import org.junit.*;
import static org.junit.Assert.*;


public class RationalTest {

    Rational rational;


    @Before
    public void setUp()
    {
       rational=new Rational(3, 4);

    }

    @Test
    public void createNew(){
        assertNotNull(rational);
    }

    @Test(expected = ArithmeticException.class)
    public void createNewDivZero(){

        Rational wrongRational=new Rational(5,0);
    }

    @Test
    public void getOneOut(){

        assertEquals(4,  rational.getDenominator());
        assertEquals(3,  rational.getNumerator());

    }

    @Test
    public void addition(){
        Rational toAdd= new Rational(2,8);
        Rational expected=new Rational(8,8);

        assertEquals(expected, rational.add(toAdd));
    }

    //subtraction

    //multiplication

    //division

    //negative of each of these operations
        //one negative
        //two negative

    //simplification(not in the interface)

}
