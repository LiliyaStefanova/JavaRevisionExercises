package CircularList;


public class CircularList {

    private CircularNode listHead;

    public CircularList(){
        this.listHead=null;
    }

    public static void main(String [] args){

        CircularList cl=new CircularList();
        CircularNode node1=new CircularNode(15);
        CircularNode node2=new CircularNode(96);
        CircularNode node3=new CircularNode(17);
        CircularNode node4=new CircularNode(15);
        CircularNode node5=new CircularNode(15);
        CircularNode node6=new CircularNode(15);
        cl.addNode(node1);
        cl.addNode(node2);
        cl.addNode(node3);
        cl.addNode(node4);
        cl.addNode(node5);

        cl.traverseForward();
        cl.deleteNode(node2);
        cl.deleteNode(node5);
        cl.deleteNode(node1);
        cl.deleteNode(node6);
        cl.traverseForward();
    }

    public void addNode(CircularNode node){
        if(listHead==null){
            listHead=node;
            listHead.setNextNode(listHead);
            return;
        }
        CircularNode current=listHead;
        while(current.getNextNode()!=listHead){
            current=current.getNextNode();
        }
        current.setNextNode(node);
        current=current.getNextNode();
        current.setNextNode(listHead);
    }

    public void deleteNode(CircularNode node){
        CircularNode last=listHead;
        CircularNode current=listHead;
        if(listHead==null){
            return;
        }
        else if(listHead.equals(node)){
            while(last.getNextNode()!=listHead){
                last=last.getNextNode();
            }
            listHead=listHead.getNextNode();
            last.setNextNode(listHead);
        }
        while(current.getNextNode()!=listHead){
            if(current.getNextNode().equals(node)){
                current.setNextNode(current.getNextNode().getNextNode());
            }
            else{
                current=current.getNextNode();
            }
        }

    }

    public void traverseForward(){
        CircularNode current=listHead.getNextNode();
        System.out.print(listHead.getNumber() + ", ");
        while(current!=listHead){
            System.out.print(current.getNumber() + ", ");
            current=current.getNextNode();
        }
        System.out.println();
    }


}
