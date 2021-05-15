/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lt.viko.eif.dziukas.soap.model;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test for players class.
 * 
 * @author Dainoras
 */
public class PlayerTest {
    
    public PlayerTest() {
    }
    
    /**
     * Test of getPlayerName method, of class Player.
     */
    @Test
    public void testGetPlayerName() {
        System.out.println("getPlayerName");
        Player instance = new Player();
        String expResult = "LeBron";
        instance.setPlayerName("LeBron");
        String result = instance.getPlayerName();
        assertEquals(expResult, result);
    }

    /**
     * Test of setPlayerName method, of class Player.
     */
    @Test
    public void testSetPlayerName() {
        System.out.println("setPlayerName");
        String playerName = "LeBron";
        Player instance = new Player();
        instance.setPlayerName(playerName);
    }

    /**
     * Test of getPlayerSurname method, of class Player.
     */
    @Test
    public void testGetPlayerSurname() {
        System.out.println("getPlayerSurname");
        Player instance = new Player();
        String expResult = "James";
        instance.setPlayerSurname("James");
        String result = instance.getPlayerSurname();
        assertEquals(expResult, result);
    }

    /**
     * Test of setPlayerSurname method, of class Player.
     */
    @Test
    public void testSetPlayerSurname() {
        System.out.println("setPlayerSurname");
        String playerSurname = "James";
        Player instance = new Player();
        instance.setPlayerSurname(playerSurname);
    }

    /**
     * Test of getPlayerAge method, of class Player.
     */
    @Test
    public void testGetPlayerAge() {
        System.out.println("getPlayerAge");
        Player instance = new Player();
        Integer expResult = 36;
        instance.setPlayerAge(36);
        Integer result = instance.getPlayerAge();
        assertEquals(expResult, result);
    }

    /**
     * Test of setPlayerAge method, of class Player.
     */
    @Test
    public void testSetPlayerAge() {
        System.out.println("setPlayerAge");
        Integer playerAge = 36;
        Player instance = new Player();
        instance.setPlayerAge(playerAge);
    }

    /**
     * Test of getPosition method, of class Player.
     */
    @Test
    public void testGetPosition() {
        System.out.println("getPosition");
        Player instance = new Player();
        String expResult = "PF";
        instance.setPosition("PF");
        String result = instance.getPosition();
        assertEquals(expResult, result);
    }

    /**
     * Test of setPosition method, of class Player.
     */
    @Test
    public void testSetPosition() {
        System.out.println("setPosition");
        String position = "PF";
        Player instance = new Player();
        instance.setPosition(position);
    }

    /**
     * Test of getHeight method, of class Player.
     */
    @Test
    public void testGetHeight() {
        System.out.println("getHeight");
        Player instance = new Player();
        Integer expResult = 199;
        instance.setHeight(199);
        Integer result = instance.getHeight();
        assertEquals(expResult, result);
    }

    /**
     * Test of setHeight method, of class Player.
     */
    @Test
    public void testSetHeight() {
        System.out.println("setHeight");
        Integer height = 199;
        Player instance = new Player();
        instance.setHeight(height);
    }

    /**
     * Test of getWeight method, of class Player.
     */
    @Test
    public void testGetWeight() {
        System.out.println("getWeight");
        Player instance = new Player();
        Integer expResult = 110;
        instance.setWeight(110);
        Integer result = instance.getWeight();
        assertEquals(expResult, result);
    }

    /**
     * Test of setWeight method, of class Player.
     */
    @Test
    public void testSetWeight() {
        System.out.println("setWeight");
        Integer weight = 100;
        Player instance = new Player();
        instance.setWeight(weight);
    }

    /**
     * Test of toString method, of class Player.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Player instance = new Player();
        String result = instance.toString();
        
       assertTrue(result.contains("playerName"));
    }
    
}
