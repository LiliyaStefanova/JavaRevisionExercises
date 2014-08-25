package SamplePaper;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.NoSuchElementException;
/**
 * Created with IntelliJ IDEA.
 * User: liliya
 * Date: 05/06/14
 * Time: 17:34
 * To change this template use File | Settings | File Templates.
 */
public class Institution<T> implements Iterable<T> {

    private Set<T> members=new HashSet<T>();

    public void enrol(T o){
        members.add(o);
    }

    public void withdraw(T o){
        if(members.isEmpty()|| (!members.contains(o))){
            throw new NoSuchElementException();
        }
        members.remove(o);
    }

    public <P extends T > void merge(Institution<P> other){
        for(P person: other) {
            other.withdraw( person);
            this.enrol( person );
        }

    }

    public static void main(String [] args){

        Child1 c1=new Child1("Matt");
        Child1 c2=new Child1("Poppy");

        Institution<Child1> kindergarten=new Institution<Child1>();

        kindergarten.enrol(c1);
    }

    @Override
    public Iterator<T> iterator() {
        return  members.iterator();
    }
}


