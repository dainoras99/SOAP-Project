/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lt.viko.eif.dziukas.soap.transform;

import lt.viko.eif.dziukas.soap.model.Team;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test for Transformation class
 * 
 * @author Dainoras
 */
public class TransformationTest {
    
    public TransformationTest() {
    }

    /**
     * Test of transformToXml method, of class Transformation.
     * @throws java.lang.Exception
     */
    @Test
    public void testTransformToXml() throws Exception {
        System.out.println("transformToXml");
        Team team = new Team();
        Transformation instance = new Transformation();
        instance.transformToXml(team);
    }

    /**
     * Test of transformToPOJO method, of class Transformation.
     * @throws java.lang.Exception
     */
    @Test
    public void testTransformToPOJO() throws Exception {
        System.out.println("transformToPOJO");
        Team team = new Team();
        String fileName = "team.xml";
        Transformation instance = new Transformation();
        Team expResult = team;
        Team result = instance.transformToPOJO(fileName);
        assertEquals(expResult, result);
    }
    
}