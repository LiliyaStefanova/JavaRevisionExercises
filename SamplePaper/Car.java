package SamplePaper;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: liliya
 * Date: 05/06/14
 * Time: 16:41
 * To change this template use File | Settings | File Templates.
 */
public class Car extends Vehicle {

        private int numberSeats;
        private String modelName;

        public Car(int a, int b, String s, int c, String t) {
            super(a, b, s);
            this.numberSeats=c;
            this.modelName=t;
        }

        public Car(Vehicle v,  int a, String s) {
            super(v.numberDoors, v.numberWheels, v.colour);
            this.numberSeats=a;
            this.modelName=s;
        }
            @Override
            public String toString() {
                super.toString();
                System.out.println("Number of seats: "+ numberSeats+ "\n"+
                                   "Model name: "+ modelName);
                System.out.println();
            return "";

            }

    public static void main(String [] args){

        List<Vehicle> vehicles= new ArrayList<Vehicle>();

        Vehicle v1=new Vehicle(4, 4, "green");
        Vehicle c1=new Car(4,4,"red", 4, "Honda");
        Vehicle c2=new Car(v1,2, "Porshe");

        vehicles.add(v1);
        vehicles.add(c1);
        vehicles.add(c2);

        for(Vehicle v: vehicles){
            v.toString();
        }
    }
}
