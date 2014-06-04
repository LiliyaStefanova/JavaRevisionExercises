package SamplePaper.Recursion;


public class NumericalSystemConversion {

    public static void convert(int number, int base) {

           if(number%base<0&&(number/base==0||number/base==1)){
               System.out.print("-");
           }
           if(number!=0){
               convert(number / base, base);
               System.out.print(Math.abs(number % base));

            }

        }

    public static void printInt(int number){
        convert(number, 10);
    }


    public static void main(String[] args) {

        //convert(-8, 2);
        printInt(-1022);
    }
}
