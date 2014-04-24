package SIngleLinkedList;


public class PatientManager {

    Patient listHead;

    public static void main(String [] args){
        PatientManager pm=new PatientManager();
        Patient patient1 =new Patient("Jim", 10);
        Patient patient2 =new Patient("Sam", 12);
        Patient patient3 =new Patient("Tom", 15);
        Patient patient4 =new Patient("Ken", 13);
        Patient patient5 =new Patient("Tim", 17);
        Patient patient6 =new Patient("Dom", 19);
        pm.addPatient(patient1);
        pm.addPatient(patient2);
        pm.addPatient(patient3);
        pm.addPatient(patient4);
        pm.addPatient(patient5);
        pm.addPatient(patient6);

        pm.prettyPrint();
        pm.length();
        pm.deletePatient(patient2);
        pm.deletePatient(patient1);

        pm.prettyPrint();
        pm.length();

    }

    public Patient getListHead() {
        return listHead;
    }

    public void setListHead(Patient listHead) {
        this.listHead = listHead;
    }

    public void addPatient(Patient patient){
        Patient current=null;
        if(listHead==null){
            listHead=patient;
            return;
        }
        current=listHead;
        while(current.getNextPatient()!=null){
            current=current.getNextPatient();
        }
        current.setNextPatient(patient);

    }

    public void deletePatient(Patient patient){
        Patient current=listHead;
        if(listHead==null){
            return;
        }
        else if(patient.equals(listHead)){
            listHead=listHead.getNextPatient();
        }
        else{
            while(!current.getNextPatient().equals(patient)){
                current.getNextPatient();
            }
            current.setNextPatient(current.getNextPatient().getNextPatient());
            current=current.getNextPatient();
        }
    }

    public void prettyPrint(){
        Patient current=listHead;
        while(current!=null){
            System.out.print(current.getName()+ ", ");
            current=current.getNextPatient();

        }
        System.out.println();
    }

    public int length(){
        int listLength=0;
        Patient current=listHead;
        while(current!=null){
            listLength++;
            current=current.getNextPatient();
        }
        System.out.println("List length is: "+listLength);
        return listLength;
    }

    private void lengthRecursive(){

    }
}
