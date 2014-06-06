package SamplePaper;

/**
 * Q19 of the sample paper
 */
public class ReplaceString {


    public static String replace(String s, char from, char to){
        String newS="";
        for(int i=0; i<s.length();i++){
            if(s.charAt(i)==from){
                newS=newS+to;
            }
            else{
                newS=newS+s.charAt(i);
            }
        }
        return newS;
    }

    public static void main(String [] args){
        System.out.println(replace("Banana Rama", 'a', 'e'));
    }
}
