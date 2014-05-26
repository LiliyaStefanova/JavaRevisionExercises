package SamplePaper;

/**
 * Created with IntelliJ IDEA.
 * User: liliya
 * Date: 17/05/14
 * Time: 20:41
 * To change this template use File | Settings | File Templates.
 */
public class Academic {

    String name;
    Academic lineManager;

    public boolean superior(Academic aca){
        if(aca.lineManager==null){
            return false;
        }
        else if(aca.lineManager.equals(this)){
            return true;
        }
        else{
            return superior(aca.lineManager);
        }
    }

    public static void main(String args []){

        Academic aca1=new Academic();
        aca1.name="john";
        Academic aca2=new Academic();
        aca2.name="rob";
        Academic aca3=new Academic();
        aca3.name="mary";
        Academic aca4=new Academic();
        aca4.name="seb";
        Academic aca5=new Academic();
        aca5.name="josie";
        Academic aca6=new Academic();
        aca6.name="josie";

        aca1.lineManager=aca2;
        aca2.lineManager=aca3;
        aca3.lineManager=aca4;
        aca4.lineManager=aca6;
        aca5.lineManager=null;

        System.out.println(aca1.superior(aca5));
        System.out.println(aca2.superior(aca3));
        System.out.println(aca4.superior(aca2));
        System.out.println(aca6.superior(aca4));
    }
}
