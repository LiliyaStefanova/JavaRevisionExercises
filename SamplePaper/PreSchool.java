package SamplePaper;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.NoSuchElementException;

public class PreSchool  {

    Set<Child1>children= new HashSet<Child1>();

    public void enrol(Child1 c){
        children.add(c);
    }

    public void withdraw(Child1 c){
        if(children.isEmpty()||(!children.contains(c))){
            throw new NoSuchElementException("No record of this child");
        }
        children.remove(c);
    }

    public static void main(String [] args){

        Child1 c1=new Child1();
        Child1 c2=new Child1();
        Child1 c3=new Child1();
        Child1 c4=new Child1();

        PreSchool ps=new PreSchool();
        ps.enrol(c1);
        ps.enrol(c2);
        ps.enrol(c3);
        ps.enrol(c4);
        ps.withdraw(c1);

    }

}
