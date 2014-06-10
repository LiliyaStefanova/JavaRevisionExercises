package SamplePaper;

/**
 * Created with IntelliJ IDEA.
 * User: liliya
 * Date: 05/06/14
 * Time: 16:34
 * To change this template use File | Settings | File Templates.
 */
public class Vehicle {

        protected int numberDoors;
        protected  int numberWheels;
        protected String colour;

        public Vehicle(int a, int b, String s){
            this.numberDoors=a;
            this.numberWheels=b;
            this.colour=s;
        }


        @Override
        public String toString()
        {   System.out.println("Number doors: "+ numberDoors+"\n"+
                               "Num wheels: "+ numberWheels+ "\n"+
                               "Color: "+colour);
            return "";
        }
}


