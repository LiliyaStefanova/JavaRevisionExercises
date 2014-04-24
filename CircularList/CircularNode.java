package CircularList;


public class CircularNode {

    private int number;
    private CircularNode nextNode;


    public CircularNode(int num){

        this.number=num;
        this.nextNode=null;
    }


    public int getNumber(){
        return number;
    }

    public void setNumber(int num){
        this.number=num;
    }

    public CircularNode getNextNode(){
        return nextNode;
    }

    public void setNextNode(CircularNode node){
        this.nextNode=node;
    }

}
