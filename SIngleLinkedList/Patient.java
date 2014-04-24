package SIngleLinkedList;

public class Patient {

    private String name;
    private int age;
    private Patient nextPatient;

    public Patient(String name, int age){

        this.name=name;
        this.age=age;
        this.nextPatient=null;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name=name;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age=age;
    }

    public Patient getNextPatient(){
        return nextPatient;
    }

    public void setNextPatient(Patient patient){
        this.nextPatient=patient;
    }




}


