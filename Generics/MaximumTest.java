package Generics;

public class MaximumTest {

    //determines the largest of 3 comparable objects
    //in this case the type parameter used by the method is bound by Comparable
    //same key word is used for both classes and interfaces
    public static <T extends Comparable<T>> T maximum(T x, T z, T y){
        T max=x;
        if(y.compareTo(x)>0){
            max=y;
        }
        if(z.compareTo(y)>0){
            max=z;
        }

        return max;
    }

    public static void main(String [] args){

        System.out.printf( "Max of %d, %d and %d is %d\n\n",
                3, 4, 5, maximum( 3, 4, 5 ) );

        System.out.printf( "Maxm of %.1f,%.1f and %.1f is %.1f\n\n",
                6.6, 8.8, 7.7, maximum( 6.6, 8.8, 7.7 ) );

        System.out.printf( "Max of %s, %s and %s is %s\n","pear",
                "apple", "orange", maximum( "pear", "apple", "orange" ) );
    }
}
