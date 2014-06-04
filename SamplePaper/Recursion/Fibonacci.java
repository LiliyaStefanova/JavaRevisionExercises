package SamplePaper.Recursion;

/**
 * Created with IntelliJ IDEA.
 * User: liliya
 * Date: 04/06/14
 * Time: 13:56
 * To change this template use File | Settings | File Templates.
 */
public class Fibonacci {

  /*  public static int fibN(int pos, int term){
        int result=0;
        if(pos<=1){
            return 1;
        }
        else{
                for(int i=pos; i>term; i--){
                   result=fibN(i-1, term);
                }
                 while(pos>0){
                    result=result+fibN(pos-1, term);
                    pos--;
            }
        return result;
        }
    }*/

    public static int fibN(int pos, int term){
        int result=0;

        if(pos<=1){
            return 1;
        }
        else{
            for(int i=1; i<=term;i++){
                result=result+fibN(pos-1, term);
            }

            return result;
        }
    }


    public static void main(String [] args){
        System.out.println(fibN(5, 3));
    }

}
