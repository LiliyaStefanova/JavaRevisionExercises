package PastPaper2013;

/**
 * Created with IntelliJ IDEA.
 * User: liliya
 * Date: 08/06/14
 * Time: 14:53
 * To change this template use File | Settings | File Templates.
 */

interface Stack<T> {
    public T top();
    public T pop();
    public T push(T c);
    public boolean isEmpty();

}