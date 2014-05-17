package Polymorphism.UpcastingDowncasting;

import java.util.ArrayList;
import java.util.List;

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
        /*
          when we try to assign the type of the superclass only the classes which were
          inherited will be available to the new object;
          However the implementation of these is the one of the SmartPhone, if it is overridden
          for example. As browse and findPosition are SmartPhone only classes, we cannot use the construct
          MobilePhone phone=new SmartPhone() to access them; this is called upcasting
         */
        MobilePhone smartie= new SmartPhone("nokia");
        //SmartPhone smartie= new SmartPhone("nokia");
        smartie.ringAlarm("9.00");
        smartie.call("0012345");
        smartie.printLastNumbers(nums);
        smartie.playGame("Worms Armageddon");
        //smartie.browseWeb("www.bal.com");
        //smartie.findPosition();
        System.out.println(smartie.getBrand());
        //indirect upcasting-passing in a SmartPhone which takes a parameter Phone
        //provides access to the Phone's methods that SmartPhone Inherited only
        //it will however use the overridden implementation of SmartPhone for the call method
       testPhone(smartie);
        //MobilePhone newMobile=new MobilePhone("Eriksson");//class cast exception
        //testPhone(newMobile);
    }
        public void testPhone(Phone s){
            //if Phone is down casted to SmartPhone, the methods become available of SmartPhone
            SmartPhone sp= (SmartPhone) s;
            System.out.println("testing");
            s.call("002344");
            sp.browseWeb("adf");
            sp.findPosition();
            sp.ringAlarm("300");
    }
}
