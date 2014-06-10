/**
 * Created with IntelliJ IDEA.
 * User: liliya
 * Date: 10/06/14
 * Time: 12:07
 * To change this template use File | Settings | File Templates.
 */
public class PrimeChecker {

    public static boolean Prime(int num){
        return isPrime(num, num-1);
    }

    public static boolean isPrime(int num, int div){

        if(div==1){
            return true;
        }
        else{
            if(num%div==0){
                return false;
            }
            else{
                return isPrime(num, div-1);
            }
        }
    }

    public static void main(String [] args){

        System.out.println(Prime(14));
    }
}
