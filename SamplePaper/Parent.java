package SamplePaper;

/**
 * Created with IntelliJ IDEA.
 * User: liliya
 * Date: 04/06/14
 * Time: 19:42
 * To change this template use File | Settings | File Templates.
 */
public class Parent extends GrandParent {

    @Override
    public boolean good() {
        System.out.println(getAge());
        System.out.println(getMore());
        return getAge() < getMore();
    }
    public int getAge() {
        return 42;
    }
    @Override
    public void eat() {
        super.eat();
        System.out.println("Ahh.........!");
    }
}