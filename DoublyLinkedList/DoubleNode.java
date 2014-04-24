package DoublyLinkedList;

/**
 * Created with IntelliJ IDEA.
 * User: liliya
 * Date: 24/04/14
 * Time: 22:01
 * To change this template use File | Settings | File Templates.
 */
public class DoubleNode {

    private String name;
    private int age;
    private DoubleNode nextNode;
    private DoubleNode previousNode;

    public DoubleNode(String name, int age){

        this.name=name;
        this.age=age;
        this.nextNode=null;
        this.previousNode=null;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name=name;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age=age;
    }

    public DoubleNode getNextNode(){
        return nextNode;
    }

    public void setNextNode(DoubleNode node){
        this.nextNode=node;
    }

    public DoubleNode getPreviousNode(){
        return previousNode;
    }

    public void setPreviousNode(DoubleNode node){
        this.previousNode=node;
    }

}
