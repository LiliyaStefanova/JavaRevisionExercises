package SamplePaper;

/**
 * Created with IntelliJ IDEA.
 * User: liliya
 * Date: 10/05/14
 * Time: 20:39
 * To change this template use File | Settings | File Templates.
 */
public class StringReplace {

    public static String replace(String str, char a, char c){
        StringBuilder newString=new StringBuilder(50);
        int currentIndex=0;
        while(currentIndex<str.length()){
            if(str.charAt(currentIndex)==a){
                newString.append(c);
            }
            else{
                newString.append(str.charAt(currentIndex));
            }
            currentIndex++;
        }

        return newString.toString();


    }

    public static void main(String [] args){

        System.out.println(replace("Jeve is fun", 'e', 'a'));
    }
}
