package SamplePaper;

/**
 * The Stack class represents*
 *
 * @param <E>
 */
public interface Stack<E> {
    /**
     * Tests if this stack is empty.
     * @return if the stack is empty
     */

    boolean isEmpty();

    /**
     * Looks at the object at the top of this stack without removing it from the stack.
     * @return the object at the top of the stack
     */
    E peek();

    /**
     * Removes the object at the top of this stack and returns that object as the value of this function.
     *@return object at the top of the stack
     */

    E pop();

    /**
     * Pushes an item onto the top of this stack.
     * @param item
     */
    void push(E item);

}
