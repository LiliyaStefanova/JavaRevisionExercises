package SIngleLinkedList;


import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class PatientManagerTest {

    PatientManager pm;

    @Before
    public void buildUp(){
        pm=new PatientManager();
    }

    @Test
    public void addPatientTest(){

        Patient newPatient=new Patient("Kim", 12);

        pm.addPatient(newPatient);

        assertEquals("Kim", pm.getListHead().getName());
    }

    @Test
    public void deletePatientTest(){

        Patient newPatient=new Patient("Kim", 12);

        pm.addPatient(newPatient);

        pm.deletePatient(newPatient);

        assertTrue(pm.length()==0);
    }
}
