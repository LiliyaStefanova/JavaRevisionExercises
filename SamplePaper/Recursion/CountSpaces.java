package SamplePaper.Recursion;

/**
 * Created with IntelliJ IDEA.
 * User: liliya
 * Date: 20/05/14
 * Time: 20:21
 * To change this template use File | Settings | File Templates.
 */
public class CountSpaces {

    public static int countSpaces(String s){

        if(s.length()==0|| s.length()==1){
            return 0;
        }
        else{
            if(s.substring(s.length()-1).equals(" ")){
                return 1+ countSpaces(s.substring(0, s.length()-1));
            }
            else{
                return countSpaces(s.substring(0, s.length()-1));
            }
        }
    }

    public static void main(String [] args){

        System.out.println(countSpaces("i love re cur sion"));
    }
}
