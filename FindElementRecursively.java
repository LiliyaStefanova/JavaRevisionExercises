
import java.util.ArrayList;
import java.util.List;

public class FindElementRecursively {

    public static <T> T findElem(T elem,List<T> list){

        if(list.isEmpty()){
            return null;
        }
        if(list.get(0).equals(elem)){
            return list.get(0);
        }
        else{

            return findElem(elem, list.subList(1, list.size()));
        }

    }

    public static <T> boolean inThere(T elem, List<T> list){

        if(list.isEmpty()){
            return false;
        }
        if(list.get(0).equals(elem)){
            return true;
        }
        else{
            return inThere(elem,list.subList(1, list.size()));
        }
    }

    public static <T> int numTimes(T elem, List<T> list){

        if(list.size()<1){
            return 0;
        }
        else{
            if(list.get(0).equals(elem)){
                return 1+ numTimes(elem, list.subList(1, list.size()));
            }
            else{
                return numTimes(elem, list.subList(1, list.size()));
            }
        }
    }

    public static void main(String [] args){

        List<String> list=new ArrayList<String>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");

        List<Integer> l=new ArrayList<Integer>();
        List<Integer> l1=new ArrayList<Integer>();
        l.add(2);
        l.add(11);
        l.add(7);
        l.add(11);
        System.out.println(findElem("d", list));

        System.out.println(inThere("b", list));

        System.out.println(numTimes(new Integer(11),l1));
    }
}
