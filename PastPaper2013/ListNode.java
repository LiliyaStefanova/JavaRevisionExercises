package PastPaper2013;

/**
 * Created with IntelliJ IDEA.
 * User: liliya
 * Date: 08/06/14
 * Time: 14:52
 * To change this template use File | Settings | File Templates.
 */
public interface ListNode<T> {

        public T getItem();
        public void setItem(T item);
        public ListNode<T> getNext();
        public void setNext(ListNode<T> next);
}
