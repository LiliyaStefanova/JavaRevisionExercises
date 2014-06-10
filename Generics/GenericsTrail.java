package Generics;


public class GenericsTrail {

    public static <T extends Comparable<T>> int greaterThan(T [] array, T element){

        int count=0;
        for(T item: array){
            //can't use > on type of T-need to extend comparable
            //comparable must have the same generic type T
            if(item.compareTo(element)>0){
                count++;
            }
        }
        return count;

    }

    public static void main(String [] args){

       Child c=new Child();
       GrandDad gd=new GrandDad();
       Dad [] d=new Dad[5];

       greaterThan(d,gd);



    }
}
