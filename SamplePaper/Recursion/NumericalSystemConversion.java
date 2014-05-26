package SamplePaper.Recursion;


public class NumericalSystemConversion {

    public static void convert(int number, int base){

        if(number==0){
            System.out.print("");
        }
        else if(number==1){
            System.out.print(number%base);
        }
        else{
            if(number<0){
               // System.out.print("-");
                convert(number/base,base);
                System.out.print(number%base);
            }
            else{
                 convert(number/base,base);
                 System.out.print(number%base);
                }
            }
        }
    public static void main(String [] args){

        convert(64, 2);
    }
}
