package PastPaper2013;

/**
 * Created with IntelliJ IDEA.
 * User: liliya
 * Date: 26/05/14
 * Time: 17:31
 * To change this template use File | Settings | File Templates.
 */
public class Question5 {

    public void abcde(String s){
        if(s.length()==0){
            System.out.print("");
        }
        else{
            System.out.println(s);
            abcde(s.substring(0, s.length()-1));
            System.out.println(s);
        }
    }

    public static void main(String args []){
        Question5 q5=new Question5();
        q5.abcde("abcde");
    }
}
