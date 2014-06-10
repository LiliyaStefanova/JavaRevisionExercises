/**
 * Created with IntelliJ IDEA.
 * User: liliya
 * Date: 10/06/14
 * Time: 10:50
 * To change this template use File | Settings | File Templates.
 */
import java.util.List;
import java.util.ArrayList;

public class ReverseList {


    public static <T> List reverseList(List<T> list){

        T temp;
        int l=list.size();

        for(int i=0; i<l; i++){
            temp=list.get(i);
            list.set(i, list.get(l-1));
            list.set(l-1, temp);
            l--;
        }
        return list;
    }

    public static <T> List reverseListForEach(List<T> list){
        int l=list.size();
        T temp;
        int pos=0;
        for(T item: list){
            pos=list.indexOf(item);
            if(pos<list.size()/2){
                temp=item;
                list.set(pos, list.get(l-1));
                list.set(l-1, temp);
                l--;
            }
        }
        return list;
    }

    public static void main(String [] args){

        List<Integer> list=new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        System.out.println(list);
        System.out.println(reverseList(list));
        System.out.println(reverseListForEach(list));

    }
}
