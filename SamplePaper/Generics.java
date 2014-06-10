package SamplePaper;

import java.util.ArrayList;
import java.util.List;


public class Generics<T extends Object> {

    public static void printElem(List<? extends Number> list){
        for(Number elem: list){
            System.out.println(elem);
        }
    }


    public static void main(String [] args){

        Generics<String> g=new Generics<String>();

        List<Number> l=new ArrayList<Number>();
        l.add(new Integer(3));
        Integer i=(Integer) l.get(0);

        List<? extends Object> ol=new ArrayList<Object>();
        Object o=new Object();
        //ol.add(o);

        List<Integer> newList=new ArrayList<Integer>();
        newList.add(4);
        newList.add(5);

        List<Double> newDl=new ArrayList<Double>();
        newDl.add(1.0);
        newDl.add(3.6);

        printElem(newList);
        printElem(newDl);

        List<? super Integer> s=new ArrayList<Integer>();
        String str="";
        Object o1=new Object();
        //s.add(o1);

         s.add(new Integer(5));

    }
}
