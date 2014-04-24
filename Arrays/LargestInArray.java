package Arrays;


import java.util.Scanner;

public class LargestInArray {

    public static void main(String args []){

        final int LENGTH=100;
        double [] value= new double[LENGTH];
        int currentSize=0;

        //read input

        System.out.println("Enter input values, Q to quit: ");
        Scanner in=new Scanner(System.in);
        while(in.hasNextDouble()&& currentSize< value.length){

            value[currentSize]=in.nextDouble();
            currentSize++;
        }

        //find the largest value

        double largest=value[0];
        for(int i=1; i<currentSize; i++){

            if(value[i]>largest){
                largest=value[i];
            }

        }

        //print all values, marking largest one

        for(int i=0; i<currentSize;i++){
            System.out.print(value[i]);
            if(value[i]==largest){
                System.out.print(" <== largest value");
            }
            System.out.println();
        }


        System.out.print(value[0]);
        for(int i=1; i<value.length; i++){
            System.out.print(","+ value[i]);
        }

    }



}
