package Arrays;

import java.util.Scanner;

public class Reverse {

    public static void main(String [] args){

        Reverse newReverse=new Reverse();
        double [] test=newReverse.readInputs();
        newReverse.multiply(test, 10);
        newReverse.printReversed(test);
    }


    public double[] readInputs(){
        System.out.println("Enter number of inputs: ");
        Scanner num=new Scanner(System.in);
        int numInputs=num.nextInt();
        double [] numbers=new double[numInputs];
        System.out.println("Enter value: ");
        Scanner in=new Scanner(System.in);
        for(int i=0; i<numInputs;i++){
            numbers[i]=in.nextDouble();
        }

        return numbers;

    }

    public void multiply(double [] numbers, double factor){

        for(int i=0; i<numbers.length; i++){
            numbers[i]=numbers[i]*factor;
        }
    }

    public void printReversed(double [] values){

        for(int i=values.length-1; i >= 0; i--){
            System.out.print(values[i] + " ");
        }
    }



}
