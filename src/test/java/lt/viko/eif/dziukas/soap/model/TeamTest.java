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
 * Test for team class.
 * 
 * @author Dainoras
 */
public class TeamTest {
    
    public TeamTest() {
    }

    @org.junit.jupiter.api.BeforeAll
    public static void setUpClass() throws Exception {
    }

    @org.junit.jupiter.api.AfterAll
    public static void tearDownClass() throws Exception {
    }

    @org.junit.jupiter.api.BeforeEach
    public void setUp() throws Exception {
    }

    @org.junit.jupiter.api.AfterEach
    public void tearDown() throws Exception {
    }
      
    /**
     * Test of getLocation method, of class Team.
     */
    @org.junit.jupiter.api.Test
    public void testGetLocation() {
        System.out.println("getLocation");
        Team instance = new Team();
        String expResult = "Boston";
        instance.setLocation("Boston");
        String result = instance.getLocation();
        assertEquals(expResult, result);
    }

    /**
     * Test of setLocation method, of class Team.
     */
    @org.junit.jupiter.api.Test
    public void testSetLocation() {
        System.out.println("setLocation");
        String location = "Boston";
        Team instance = new Team();
        instance.setLocation(location);
    }

    /**
     * Test of getTeamName method, of class Team.
     */
    @org.junit.jupiter.api.Test
    public void testGetTeamName() {
        System.out.println("getTeamName");
        Team instance = new Team();
        String expResult = "Celtics";
        instance.setTeamName("Celtics");
        String result = instance.getTeamName();
        assertEquals(expResult, result);
    }

    /**
     * Test of setTeamName method, of class Team.
     */
    @org.junit.jupiter.api.Test
    public void testSetTeamName() {
        System.out.println("setTeamName");
        String teamName = "Celtics";
        Team instance = new Team();
        instance.setTeamName(teamName);
    }

    /**
     * Test of getConference method, of class Team.
     */
    @org.junit.jupiter.api.Test
    public void testGetConference() {
        System.out.println("getConference");
        Team instance = new Team();
        String expResult = "Eastern";
        instance.setConference("Eastern");
        String result = instance.getConference();
        assertEquals(expResult, result);
    }

    /**
     * Test of setConference method, of class Team.
     */
    @org.junit.jupiter.api.Test
    public void testSetConference() {
        System.out.println("setConference");
        String conference = "Eastern";
        Team instance = new Team();
        instance.setConference(conference);
    }

    /**
     * Test of getDivision method, of class Team.
     */
    @org.junit.jupiter.api.Test
    public void testGetDivision() {
        System.out.println("getDivision");
        Team instance = new Team();
        String expResult = "Pacific";
        instance.setDivision("Pacific");
        String result = instance.getDivision();
        assertEquals(expResult, result);
    }

    /**
     * Test of setDivision method, of class Team.
     */
    @org.junit.jupiter.api.Test
    public void testSetDivision() {
        System.out.println("setDivision");
        String division = "Pacific";
        Team instance = new Team();
        instance.setDivision(division);
    }

    /**
     * Test of getFounded method, of class Team.
     */
    @org.junit.jupiter.api.Test
    public void testGetFounded() {
        System.out.println("getFounded");
        Team instance = new Team();
        Integer expResult = 1932;
        instance.setFounded(1932);
        Integer result = instance.getFounded();
        assertEquals(expResult, result);
    }

    /**
     * Test of setFounded method, of class Team.
     */
    @org.junit.jupiter.api.Test
    public void testSetFounded() {
        System.out.println("setFounded");
        Integer founded = 1932;
        Team instance = new Team();
        instance.setFounded(founded);
    }

    /**
     * Test of getTitleCount method, of class Team.
     */
    @org.junit.jupiter.api.Test
    public void testGetTitleCount() {
        System.out.println("getTitleCount");
        Team instance = new Team();
        Integer expResult = 17;
        instance.setTitleCount(17);
        Integer result = instance.getTitleCount();
        assertEquals(expResult, result);
    }

    /**
     * Test of setTitleCount method, of class Team.
     */
    @org.junit.jupiter.api.Test
    public void testSetTitleCount() {
        System.out.println("setTitleCount");
        Integer titleCount = 17;
        Team instance = new Team();
        instance.setTitleCount(titleCount);
    }

    /**
     * Test of getArena method, of class Team.
     */
    @org.junit.jupiter.api.Test
    public void testGetArena() {
        System.out.println("getArena");
        Team instance = new Team();
        String expResult = "Siemens";
        instance.setArena("Siemens");
        String result = instance.getArena();
        assertEquals(expResult, result);
    }

    /**
     * Test of setArena method, of class Team.
     */
    @org.junit.jupiter.api.Test
    public void testSetArena() {
        System.out.println("setArena");
        String arena = "Siemens";
        Team instance = new Team();
        instance.setArena(arena);
    }

    /**
     * Test of getTeamColors method, of class Team.
     */
    @org.junit.jupiter.api.Test
    public void testGetTeamColors() {
        System.out.println("getTeamColors");
        Team instance = new Team();
        TeamColors expResult = null;
        TeamColors result = instance.getTeamColors();
        assertEquals(expResult, result);
    }

    /**
     * Test of setTeamColors method, of class Team.
     */
    @org.junit.jupiter.api.Test
    public void testSetTeamColors() {
        System.out.println("setTeamColors");
        TeamColors teamColors = null;
        Team instance = new Team();
        instance.setTeamColors(teamColors);
    }

    /**
     * Test of getHeadCoach method, of class Team.
     */
    @org.junit.jupiter.api.Test
    public void testGetHeadCoach() {
        System.out.println("getHeadCoach");
        Team instance = new Team();
        HeadCoach expResult = null;
        HeadCoach result = instance.getHeadCoach();
        assertEquals(expResult, result);
    }

    /**
     * Test of setHeadCoach method, of class Team.
     */
    @org.junit.jupiter.api.Test
    public void testSetHeadCoach() {
        System.out.println("setHeadCoach");
        HeadCoach headCoach = null;
        Team instance = new Team();
        instance.setHeadCoach(headCoach);
    }

    /**
     * Test of getPlayers method, of class Team.
     */
    @org.junit.jupiter.api.Test
    public void testGetPlayers() {
        System.out.println("getPlayers");
        Team instance = new Team();
        Players expResult = null;
        Players result = instance.getPlayers();
        assertEquals(expResult, result);
    }

    /**
     * Test of setPlayers method, of class Team.
     */
    @org.junit.jupiter.api.Test
    public void testSetPlayers() {
        System.out.println("setPlayers");
        Players players = null;
        Team instance = new Team();
        instance.setPlayers(players);
    }

    /**
     * Test of toString method, of class Team.
     */
    @org.junit.jupiter.api.Test
    public void testToString() {
        System.out.println("toString");
        Team instance = new Team();
        String result = instance.toString();
        assertTrue(result.contains("Team"));
        
    }
    
}