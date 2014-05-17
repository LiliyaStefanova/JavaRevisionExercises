package Polymorphism.UpcastingDowncasting;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: liliya
 * Date: 17/05/14
 * Time: 11:54
 * To change this template use File | Settings | File Templates.
 */
public class MobilePhone extends OldPhone {

    public MobilePhone(String brand){
        super(brand);
    }

    private List<Integer> lastTenNumbers;

    public void ringAlarm(String time){

        System.out.println(" Alarm ringing at: "+time);
    }

    protected void playGame(String name){

        System.out.println("Playing game: "+name);
    }

    public void printLastNumbers(List<Integer> numbers){
        for(Integer number: numbers){
            System.out.println(number);
        }
    }
}
