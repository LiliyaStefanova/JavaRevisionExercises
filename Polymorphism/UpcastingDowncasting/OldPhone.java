package Polymorphism.UpcastingDowncasting;

/**
 * Created with IntelliJ IDEA.
 * User: liliya
 * Date: 17/05/14
 * Time: 11:51
 * To change this template use File | Settings | File Templates.
 */
public class OldPhone implements Phone {


    private String brand=null;

    public OldPhone(String brand){
        this.brand=brand;
    }

    public String getBrand(){
        return this.brand;
    }

    @Override
    public void call(String number) {
        System.out.println("Calling "+ number);
    }
}
