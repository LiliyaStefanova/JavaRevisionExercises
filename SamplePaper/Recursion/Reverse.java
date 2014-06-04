package SamplePaper.Recursion;

/**
 * Created with IntelliJ IDEA.
 * User: liliya
 * Date: 20/05/14
 * Time: 20:18
 * To change this template use File | Settings | File Templates.
 */
public class Reverse {

    public static String reverse(String s, int len){

        if(len==0|| len==1){
            return s;
        }
        else{
            return s.substring(len-1)+ reverse(s.substring(0, len-1), len-1);
        }
    }

    public static void memoryBlockReverse(String str1, String str2, int len1, int len2){

        String s=reverse(str1+str2, len1+len2);

        String o=reverse(s.substring(0, len1), len1);
        String t=reverse(s.substring(len1, len1+len2),len2);

        System.out.print(o);
        System.out.println(t);

    }

    public static void main(String [] args){

        System.out.println(reverse("abcd", 4));

       memoryBlockReverse("abcd", "efgh", 4, 4);
    }

}
