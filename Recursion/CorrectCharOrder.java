package Recursion;

/**
 *Question asked by Keith in one of the revision sessions
 * Write a recursive method that returns true if:
 * All odd characters are in ascending order
 * All even characters are in descending order
 * Or false otherwise
 *
 * Note: This solution assumes a string starts from position 0 and therefore this is an even position
 */
public class CorrectCharOrder {

    public static boolean correctOrder(String str){
        //base case-if there are only 2 chars and the first and last are in correct order-true
        if(str.length()==3 && (str.charAt(0)>str.charAt(2))){
            return true;
        }
        //if the string is less than 3 chars long it returns true as impossible to determine
        else if(str.length()<3){
            return true;
        }
        else{
            if(str.charAt(0)>str.charAt(2)&& str.charAt(1)<str.charAt(3)){
                return correctOrder(str.substring(2, str.length()));
            }
            else{
                return false;
            }
        }
    }

    public static void main(String [] args){

        System.out.println(correctOrder("d"));
    }
}
