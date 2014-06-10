package PastPaper2013;

/**
 * Created with IntelliJ IDEA.
 * User: liliya
 * Date: 08/06/14
 * Time: 14:57
 * To change this template use File | Settings | File Templates.
 */
public class ListNodeImpl<T> implements ListNode<T> {

    private T item;
    private ListNode<T> next;

    public ListNodeImpl(T item) {
        this.item = item;
        this.next = null;
    }

    @Override
    public T getItem() {

        return item;
    }

    @Override
    public void setItem(T item) {
        this.item = item;
    }

    @Override
    public ListNode<T> getNext() {
        return next;
    }

    @Override
    public void setNext(ListNode<T> next) {

        this.next = next;
    }

    public static int listSum(ListNode<Integer> head){
        int sum=0;
        ListNode<Integer> current=head;

        if(head==null){
            return 0; //empty list
        }

        else{
                while(current!=null){
                    sum+=current.getItem();
                    current=current.getNext();
                }
        }

        return sum;
    }



    }
