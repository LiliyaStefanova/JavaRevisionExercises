package Polymorphism.UpcastingDowncasting;

/**
 * Created with IntelliJ IDEA.
 * User: liliya
 * Date: 17/05/14
 * Time: 12:16
 * To change this template use File | Settings | File Templates.
 */
public class RestrictedSmartPhone extends SmartPhone {

    public RestrictedSmartPhone(String brand){
        super(brand);
    }
    //Cannot override with a private modifier as it is not allowed to have weaker access modifiers on overriding classed
    //i.e. a class overriding a public or protected method cannot have an access modifier of private
    @Override
    public void playGame(String name){

    }

}
