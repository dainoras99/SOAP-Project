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
 * Test for TeamColors class.
 * 
 * @author Dainoras
 */
public class TeamColorsTest {
    


    /**
     * Test of getTeamColor method, of class TeamColors.
     */
    @Test
    public void testGetTeamColor() {
        System.out.println("getTeamColor");
        TeamColors instance = new TeamColors();
        List<String> expResult = null;
        List<String> result = instance.getTeamColor();
        assertEquals(expResult, result);
    }

    /**
     * Test of setTeamColor method, of class TeamColors.
     */
    @Test
    public void testSetTeamColor() {
        System.out.println("setTeamColor");
        List<String> teamColor = null;
        TeamColors instance = new TeamColors();
        instance.setTeamColor(teamColor);
    }

    /**
     * Test of toString method, of class TeamColors.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        TeamColors instance = new TeamColors();
        String result = instance.toString();
        assertTrue(result.contains("teamColor"));
    }
}