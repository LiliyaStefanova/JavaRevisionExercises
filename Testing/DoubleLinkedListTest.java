package Testing;


import DoublyLinkedList.DoubleList;
import DoublyLinkedList.DoubleNode;
import org.junit.*;
import static org.junit.Assert.*;

public class DoubleLinkedListTest {

    DoubleList newList;

    @Before
    public void buildUp(){
        newList=new DoubleList();

    }
    @After
    public void cleanUp(){
        newList=null;
    }

    @Test(timeout = 1000)
    public void addNodeTest(){

        DoubleNode expected=new DoubleNode("Richard", 23);
        DoubleNode actual= new DoubleNode("Richard", 23);
        newList.addNode(actual);

        assertEquals(expected.getName(),newList.getNode("Richard").getName());
    }

    @Test
    public void removeNodeHead(){

        DoubleNode expected=new DoubleNode("Richard", 23);

        DoubleNode actual= new DoubleNode("Richard", 23);
        DoubleNode actual2= new DoubleNode("Ben", 23);
        newList.addNode(actual);
        newList.addNode(actual2);

        assertEquals(actual, newList.deleteNode(actual));
    }




}
