package PastPaper2013;

import java.util.ArrayList;
import java.util.List;
/**
 * Created with IntelliJ IDEA.
 * User: liliya
 * Date: 08/06/14
 * Time: 14:54
 * To change this template use File | Settings | File Templates.
 */
public class StackImpl<T> implements Stack<T> {

    List<T> stack=new ArrayList<T>();

    @Override
    public T top() {
        return stack.get(stack.size()-1);

    }

    @Override
    public T pop() {

        T item= stack.get(stack.size()-1);
        stack.remove(stack.size()-1);
        return item;

    }

    @Override
    public T push(T c) {
        stack.add(c);
        return stack.get(stack.size()-1);
    }

    @Override
    public boolean isEmpty() {

        return stack.isEmpty();
    }
}
