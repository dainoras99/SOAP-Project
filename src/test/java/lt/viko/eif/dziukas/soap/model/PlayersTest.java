/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lt.viko.eif.dziukas.soap.model;

import java.util.List;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test for Players class.
 * 
 * @author Dainoras
 */
public class PlayersTest {
    
    public PlayersTest() {
    }

    /**
     * Test of getPlayer method, of class Players.
     */
    @Test
    public void testGetPlayer() {
        System.out.println("getPlayer");
        Players instance = new Players();
        List<Player> expResult = null;
        List<Player> result = instance.getPlayer();
        assertEquals(expResult, result);
    }

    /**
     * Test of setPlayer method, of class Players.
     */
    @Test
    public void testSetPlayer() {
        System.out.println("setPlayer");
        List<Player> player = null;
        Players instance = new Players();
        instance.setPlayer(player);
    }

    /**
     * Test of toString method, of class Players.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Players instance = new Players();
        String result = instance.toString();
        assertTrue(result.contains("player"));
    }
    
}
