package Polymorphism.UpcastingDowncasting;

/**
 * Created with IntelliJ IDEA.
 * User: liliya
 * Date: 17/05/14
 * Time: 12:00
 * To change this template use File | Settings | File Templates.
 */
public class SmartPhone extends MobilePhone {

    public SmartPhone(String brand){
        super(brand);
    }

    public void browseWeb(String url){
        System.out.println("Browsing: "+url);

    }

    public String findPosition(){
        return   "51, 35";
    }

    @Override
    public void call(String number){
        if(number.substring(0,2).equals("00")){
            System.out.println("Calling "+ number+ " through the internet to save money");
        }
        else{
            super.call(number);
        }
    }
}
