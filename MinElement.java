/**
 * Created with IntelliJ IDEA.
 * User: liliya
 * Date: 06/06/14
 * Time: 14:22
 * To change this template use File | Settings | File Templates.
 */
import java.util.List;
import java.util.ArrayList;

public class MinElement {

    //create a generic method to find the smallest element in an array list of any type
    //the reference type for the comparison must be specified prior to return type
    //the reference type must extend Comparable, otherwise we will not be able to compare elements of type T
    public static <T extends Comparable<T>>  T findMin(List<T> al){

        T min=null;
        //remember to test if null or empty-throw an exception-index out of bounds used here
        if((al==null)||(al.isEmpty())){
            throw new IndexOutOfBoundsException("Empty or non-existent list");
        }
        else{
            //start with first element on the list
            min=al.get(0);
            for(T item: al){
                //cannot use this unless extending comparable
                if(item.compareTo(min)<0){
                    min=item;
                }
            }
        }

        return min;
    }

    public static void main(String [] args){

        List<Integer> test=new ArrayList<Integer>();
        test.add(5);
        test.add(2);
        test.add(9);
        test.add(11);

        System.out.println(findMin(test));
    }
}
