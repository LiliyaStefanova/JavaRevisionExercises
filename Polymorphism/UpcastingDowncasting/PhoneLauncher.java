package Polymorphism.UpcastingDowncasting;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: liliya
 * Date: 17/05/14
 * Time: 12:03
 * To change this template use File | Settings | File Templates.
 */
public class PhoneLauncher {

    public static void main(String [] args){
        PhoneLauncher launcher=new PhoneLauncher();
        launcher.launch();

    }

    public void launch(){

        List<Integer> nums=new ArrayList<Integer>();
        nums.add(2);
        nums.add(5);
        nums.add(7);
        nums.add(9);
        SmartPhone smartie= new SmartPhone("nokia");
        smartie.ringAlarm("9.00");
        smartie.call("0012345");
        smartie.printLastNumbers(nums);
        smartie.playGame("Worms Armageddon");
        smartie.browseWeb("www.bal.com");
        smartie.findPosition();
        System.out.println(smartie.getBrand());
    }
}
