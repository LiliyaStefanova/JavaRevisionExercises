package SamplePaper;

/**
 * Created with IntelliJ IDEA.
 * User: liliya
 * Date: 04/06/14
 * Time: 16:25
 * To change this template use File | Settings | File Templates.
 */
public class Person {

   private String firstName;
   private String lastName;

   public Person(String first, String last){
       this.firstName=first;
       this.lastName=last;
   }

   @Override
    public String toString(){
       return firstName+" "+lastName;
   }

   @Override
    public boolean equals(Object o){
       if(!(o instanceof Person)){
           return false;
       }
           Person p2=(Person) o;
           return (this.firstName.equals(p2.firstName)&&this.lastName.equals(p2.lastName));
       }
   public static void main(String [] args){

       Person p1=new Person("Tim", "Smith");
       Person p2=new Person("Tim", "Smith");
       Person p3=new Person("Tom", "Smith");
       Object o1=new Object();

       System.out.println(p1);
       System.out.println(p1.equals(p2));
       System.out.println(p1.equals(p3));
       System.out.println(p1.equals(o1));


   }
}
