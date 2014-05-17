package Recursion;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * User: liliya
 * Date: 03/05/14
 * Time: 18:17
 * To change this template use File | Settings | File Templates.
 */
public class StringRecursion {

    int [] arr= {1, 2, 4, 5};
    int [] arr1= Arrays.copyOfRange(arr, 2, 4);

    public static  String changeXY(String str) {

        if(str.length()==0){
            return str;
        }
        else if(str.length()==1 && str.equals("x")){
            String s=str.replace(str.substring(str.length()-1),"y");
            return s;
        }
        else if(str.length()==1 && ! str.equals("x")){
            return str;
        }
        else{
            if(str.substring(str.length()-1).equals("x")){
                String s=str.replace(str.substring(str.length()-1),"y");
                return changeXY(s)+ str.substring(str.length()-1);
            }
            else{
                return changeXY(str.substring(0,str.length()-1))+str.substring(str.length()-1);
            }
        }

    }

    public static String pairStar(String str) {
        if(str.length()==0 || str.length()==1){
            return str;
        }
        else{
            if(str.substring(str.length()-1).equals(str.substring(str.length()-2, str.length()-1))){
                    return pairStar(str.substring(0, str.length()-1))+"*"+ str.substring(str.length()-1);
            }
            else{
                    return pairStar(str.substring(0, str.length()-1))+str.substring(str.length()-1);
            }
        }

    }

    public static String stringClean(String str) {
        if(str.length()==0 || str.length()==1){
            return str;
        }
        else{
            if(str.substring(str.length()-1).equals(str.substring(str.length()-2, str.length()-1))){
                return stringClean(str.substring(0, str.length()-1));
            }
            else{
                return stringClean(str.substring(0, str.length()-1))+str.substring(str.length()-1);
            }
        }
    }




    public static void main(String [] args){
        String x="xxhixx";
       // System.out.println(changeXY(x));
        //System.out.println(pairStar(x));
        System.out.println(stringClean(x));

    }

}
