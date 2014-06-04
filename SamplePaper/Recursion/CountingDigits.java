package SamplePaper.Recursion;

/**
 * Created with IntelliJ IDEA.
 * User: liliya
 * Date: 20/05/14
 * Time: 21:27
 * To change this template use File | Settings | File Templates.
 */
public class CountingDigits {

    public static int countDigits(int n, int digit){

        if(n%10==n){
            if(n==digit){
            return 1;
        }
            else{
            return 0;
            }
        }
        else{
            if(n%10==digit){
                return 1+ countDigits(n/10, digit);
            }
            else{
                return countDigits(n/10, digit);
            }
        }

    }

    public static void main(String [] args){

        System.out.println(countDigits(1101, 2));
    }
}
