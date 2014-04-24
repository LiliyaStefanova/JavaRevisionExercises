package DoublyLinkedList;

/**
 * Created with IntelliJ IDEA.
 * User: liliya
 * Date: 24/04/14
 * Time: 22:01
 * To change this template use File | Settings | File Templates.
 */
public class DoubleList {

    DoubleNode listHead;

    public DoubleList(){
        this.listHead=null;
    }

    public static void main(String [] args){

        DoubleList dl=new DoubleList();
        DoubleNode node1=new DoubleNode("Smith", 15);
        DoubleNode node2=new DoubleNode("Rand", 96);
        DoubleNode node3=new DoubleNode("Ellen", 17);
        DoubleNode node4=new DoubleNode("Coco", 15);
        DoubleNode node5=new DoubleNode("Mama", 15);
        dl.addNode(node1);
        dl.addNode(node2);
        dl.addNode(node3);
        dl.addNode(node4);
        dl.addNode(node5);

        dl.traverseForward();
        dl.traverseBackward();

        dl.deleteNode(node1);
        dl.traverseForward();
    }

    public void addNode(DoubleNode node){
        if(listHead==null){
           listHead=node;
            return;
        }
        DoubleNode current=listHead;
        while(current.getNextNode()!=null){
            current=current.getNextNode();
        }
        current.setNextNode(node);
        current.getNextNode().setPreviousNode(current);
        current=current.getNextNode();
    }

    public void deleteNode(DoubleNode node){
        if(listHead==null){
            return;
        }
        else if(listHead.equals(node)){
            listHead=listHead.getNextNode();
            listHead.setPreviousNode(null);
        }
        DoubleNode current=listHead;
        while(current.getNextNode()!=null){
            if(current.equals(node)){
                DoubleNode temp;
                temp=current.getPreviousNode();
                current=current.getNextNode();
                temp.setNextNode(current);
                current.setPreviousNode(temp);
            }
            else{
                current=current.getNextNode();
            }
        }

    }

    public void traverseForward(){
        DoubleNode current=listHead;
        while(current!=null){
            System.out.print(current.getName() + ", ");
            current=current.getNextNode();
        }
        System.out.println();
    }

    public void traverseBackward(){
        DoubleNode current=listHead;
        while(current.getNextNode()!=null){
            current=current.getNextNode();
        }
        while(current!=null){
            System.out.print(current.getName()+ ", ");
            current=current.getPreviousNode();
        }
        System.out.println();
    }

}
