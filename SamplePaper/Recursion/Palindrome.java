package SamplePaper.Recursion;

/**
 * Created with IntelliJ IDEA.
 * User: liliya
 * Date: 20/05/14
 * Time: 20:58
 * To change this template use File | Settings | File Templates.
 */
public class Palindrome {

    public static boolean palindrome(String s){

        if(s.length()==0 || s.length()==1){
            return true;
        }
        else{
            if(s.substring(0,1).equals(s.substring(s.length()-1))){
                return palindrome(s.substring(1, s.length()-1));
            }
            else{
                return false;
            }

        }
    }

    public static void main(String [] args){

        System.out.println(palindrome("51215"));
    }
}
