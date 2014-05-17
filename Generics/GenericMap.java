package Generics;

/**
 * Created with IntelliJ IDEA.
 * User: liliya
 * Date: 17/05/14
 * Time: 13:21
 * To change this template use File | Settings | File Templates.
 */
public interface GenericMap<K, V> {

    /**
     * Adds elements to the list
     * @param key
     * @param value
     */
    void put(K key, V value);

    /**
     * retrieves the value at a particular key position
     * @param key
     * @return
     */
    V get(K key);

    /**
     * removes the value at a map position
     * @param key
     * @return
     */
    V remove(K key);

    /**
     * checks if map is empty
     */

    boolean isEmpty();


}
