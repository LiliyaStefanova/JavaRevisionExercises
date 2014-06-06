package SamplePaper;

/**
 * Created with IntelliJ IDEA.
 * User: liliya
 * Date: 06/06/14
 * Time: 11:57
 * To change this template use File | Settings | File Templates.
 */
public class StringBufferDemo {

    public static void main(String [] args){

        StringBuffer sb=new StringBuffer("Hello World");
        sb.insert(6, "to the ");
        System.out.println(sb.toString());
    }
}
