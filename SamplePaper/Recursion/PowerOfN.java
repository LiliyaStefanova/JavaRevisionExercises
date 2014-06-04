package SamplePaper.Recursion;

/**
 * Created with IntelliJ IDEA.
 * User: liliya
 * Date: 20/05/14
 * Time: 21:05
 * To change this template use File | Settings | File Templates.
 */
public class PowerOfN {

    public static int powerOf(int base, int exponent){

        if(exponent==0){
            return 1;
        }
        else if(base==0){
            return 0;
        }
        else{
            return base*powerOf(base, exponent-1);
        }
    }

    public static int power2(int base, int exponent){
        if(exponent==0){
            return 1;
        }
        else if(exponent==1){
            return base;
        }
        else{
            return base*power2(base, exponent-1);
        }
    }

    public static void main(String [] args){

        System.out.println(power2(0, 6));
    }
}
