package SamplePaper.Recursion;

/**
 * Created with IntelliJ IDEA.
 * User: liliya
 * Date: 20/05/14
 * Time: 20:30
 * To change this template use File | Settings | File Templates.
 */
//TODO not working

public class ReplaceSymbols {

    public static String replace(String s, char from, char to){
        //do not use equals as this will not work properly on chars
        if((s.length()==1)&&(s.charAt(0)==from)){
            return ""+to;
        }
        else if(s.length()==0){
            return "";
        }
        else{
            //do not try to use equals as this will not work properly on chars
            if(s.charAt(s.length()-1)==from){
                return replace(s.substring(0, s.length()-1), from, to)+ ""+to;
            }
            else{
                return replace(s.substring(0, s.length()-1), from, to)+ s.substring(s.length()-1);
            }

        }
    }

    public static void main(String [] args){

       System.out.println(replace("mango bongo tongo", 'g', 't'));
    }
}
