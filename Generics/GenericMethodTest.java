package Generics;


public class GenericMethodTest {

    //creating a generic method that takes in a generic type
    // in order to make it generic use <type param> before method return type
    //type parameters can be bound using key word extends/super-upper or lower bound
    public static <E> void printArray(E[] inputArray){

        for(E element: inputArray){
            System.out.printf("%s", element);
        }

        System.out.println();
    }

    public static void main(String [] args){

        Integer [] newIntArray= {1,2,3,4,5,6};
        String [] newStringArray={"H", "E", "l", "l", "o"};
        Double [] newDoubleArray={1.2, 4.5, 7.8, 3.9};
        printArray(newIntArray);
        printArray(newStringArray);
        printArray(newDoubleArray);
    }

}
