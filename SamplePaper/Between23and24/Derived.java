package SamplePaper.Between23and24;

/**
 * Created with IntelliJ IDEA.
 * User: liliya
 * Date: 06/06/14
 * Time: 13:30
 * To change this template use File | Settings | File Templates.
 */
class Derived extends Base{

        @Override
        public void methodOne(int a){
        super.methodOne(a);
        System.out.print("X");
    }


    public void methodOne(Integer a) {
        super.methodOne();
        System.out.print("C");
    }

    @Override

    public void methodTwo() {
        super.methodTwo();
        System.out.print("D");
    }

    public void methodTwo(Integer x) {
        System.out.println("!");
    }



}


