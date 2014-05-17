package Generics;

import java.lang.reflect.Array;

/**
 * Created with IntelliJ IDEA.
 * User: liliya
 * Date: 17/05/14
 * Time: 13:24
 * To change this template use File | Settings | File Templates.
 */
public class GenericMapImpl<K, V> implements GenericMap<K, V> {

    private V values [];
    public static final int DEFAULT_SIZE=1000;

    @SuppressWarnings("unchecked cast")
    public GenericMapImpl(Class<V> type){
        values= (V[]) Array.newInstance(type, DEFAULT_SIZE);
    }

    @Override
    public void put(K key, V value) {
        values[getKeyMap(key)]=value;
    }

    @Override
    public V get(K key) {
        int keyMap=getKeyMap(key);
        if(values[keyMap]!=null){
            return values[keyMap];
        }
        else{
            return null;
        }
    }

    @Override
    public V remove(K key) {
        V temp=null;
        int keyMap=getKeyMap(key);
        if(values[keyMap]!=null){
            temp=values[keyMap];
            values[keyMap]=null;
        }
        else{
            return null;
        }
        return temp;
    }

    /**
     * This method does not have to be specified in the interface as all classes inherit it
     * Even though I have specified the object instantiation with a type generic map, it still picks up the local
     * implementation in GenericMapImpl
     * @return
     */
    @Override
    public String toString(){
        for(V value: values){
            if(value!=null){
            System.out.println(value);
            }
        }
        return values.toString();
    }

    @Override
    public boolean isEmpty() {
       return  values.length==0;
    }

    static int  shortHash(int n){
       return Math.abs(n%1000);
    }
    /**
     * takes in a key and returns a short has code for it
     * @param key
     * @return short hash code
     */
    private int getKeyMap(K key){
        int hash=key.hashCode();
        return shortHash(hash);
    }



    public static void main(String [] args){

        GenericMap<Integer,String> newMap=new GenericMapImpl<Integer, String>(String.class);
        newMap.put(4, "apple");
        newMap.put(7, "banana");
        newMap.put(10, "mango");
        newMap.toString();
    }
}
