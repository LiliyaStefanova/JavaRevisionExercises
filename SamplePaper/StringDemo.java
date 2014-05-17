package SamplePaper;

/**
 * Created with IntelliJ IDEA.
 * User: liliya
 * Date: 10/05/14
 * Time: 21:03
 * To change this template use File | Settings | File Templates.
 */
public class StringDemo {

    private String str1= "New String";
    private String str2=new String("Another String");

    public String concatenate(String a, String b){
        return a+b;
    }

    public int findNumChars(String str){
        return str.length();
    }

    public String whichOccursFirst(String a, String b){
        if(a.charAt(0)>b.charAt(0)){
            return b;
        }
        else if(a.charAt(0)<b.charAt(0)){
            return a;
        }
        else{
            return whichOccursFirst(a.substring(1, a.length()-1),b.substring(1, a.length()));
        }
    }
    public boolean equals(Object str1, Object str2){
        boolean isEqual=false;
        if(str1 instanceof String && str2 instanceof String){
            isEqual=str1.equals(str2);
        }
        return isEqual;
    }

    public String toLowerCase(String str){
        return str.toLowerCase();
    }

    public static void main(String [] args){
        StringDemo sd=new StringDemo();
        sd.launch();
    }

    public void launch(){
        //System.out.println(concatenate(str1, str2));
        //System.out.println(findNumChars(str1));
        //System.out.println(whichOccursFirst(str1, str2));
        //System.out.println(equals(str1, str2));
        System.out.println(toLowerCase(str1));
    }
}
