/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lt.viko.eif.dziukas.soap.model;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test for Head Coach class
 * 
 * @author Dainoras
 */
public class HeadCoachTest {
    
    public HeadCoachTest() {
    }
    
    /**
     * Test of getCoachName method, of class HeadCoach.
     */
    @Test
    public void testGetCoachName() {
        System.out.println("getCoachName");
        HeadCoach instance = new HeadCoach();
        String expResult = "Andrius";
        instance.setCoachName("Andrius");
        String result = instance.getCoachName();
        assertEquals(expResult, result);
    }

    /**
     * Test of setCoachName method, of class HeadCoach.
     */
    @Test
    public void testSetCoachName() {
        System.out.println("setCoachName");
        String coachName = "Andrius";
        HeadCoach instance = new HeadCoach();
        instance.setCoachName(coachName);
    }

    /**
     * Test of getCoachSurname method, of class HeadCoach.
     */
    @Test
    public void testGetCoachSurname() {
        System.out.println("getCoachSurname");
        HeadCoach instance = new HeadCoach();
        String expResult = "White";
        instance.setCoachSurname("White");
        String result = instance.getCoachSurname();
        assertEquals(expResult, result);
    }

    /**
     * Test of setCoachSurname method, of class HeadCoach.
     */
    @Test
    public void testSetCoachSurname() {
        System.out.println("setCoachSurname");
        String coachSurname = "White";
        HeadCoach instance = new HeadCoach();
        instance.setCoachSurname(coachSurname);
    }

    /**
     * Test of getCoachAge method, of class HeadCoach.
     */
    @Test
    public void testGetCoachAge() {
        System.out.println("getCoachAge");
        HeadCoach instance = new HeadCoach();
        Integer expResult = 53;
        instance.setCoachAge(53);
        Integer result = instance.getCoachAge();
        assertEquals(expResult, result);
    }

    /**
     * Test of setCoachAge method, of class HeadCoach.
     */
    @Test
    public void testSetCoachAge() {
        System.out.println("setCoachAge");
        Integer coachAge = 53;
        HeadCoach instance = new HeadCoach();
        instance.setCoachAge(coachAge);
    }

    /**
     * Test of toString method, of class HeadCoach.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        HeadCoach instance = new HeadCoach();
        String result = instance.toString();
        assertTrue(result.contains("coachName"));
    }
    
    
}
