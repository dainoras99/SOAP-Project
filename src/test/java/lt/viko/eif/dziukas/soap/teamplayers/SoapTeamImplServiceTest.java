/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lt.viko.eif.dziukas.soap.teamplayers;

import java.io.IOException;
import javax.xml.bind.JAXBException;
import lt.viko.eif.dziukas.soap.model.Player;
import lt.viko.eif.dziukas.soap.model.Players;
import lt.viko.eif.dziukas.soap.model.Team;
import lt.viko.eif.dziukas.soap.transform.Transformation;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Represents test class for main method
 * 
 * @author Dainoras
 * @version 1.0
 * @since 1.0
 */
public class SoapTeamImplServiceTest {
    
    public SoapTeamImplServiceTest() {
    }

    /**
     * Test of getTeam method, of class SoapTeamImplService.
     * @throws javax.xml.bind.JAXBException
     * @throws java.io.IOException
     */
    @Test
    public void testGetTeam() throws JAXBException, IOException {
        System.out.println("getTeam");
        SoapTeamImplService instance = new SoapTeamImplService();
        Transformation transformation = new Transformation();
        Team team = transformation.transformToPOJO("team.xml");
        Team expResult = team;
        Team result = team;
        assertEquals(expResult, result);
    }

    /**
     * Test of updateTeamName method, of class SoapTeamImplService.
     */
    @Test
    public void testUpdateTeamName() {
        System.out.println("updateTeamName");
        String name = "Clippers";
        SoapTeamImplService instance = new SoapTeamImplService();
        String expResult = name + " - New team name";
        String result = instance.updateTeamName(name);
        assertEquals(expResult, result);
    }

    /**
     * Test of addTeamsWebsite method, of class SoapTeamImplService.
     */
    @Test
    public void testAddTeamsWebsite() {
        System.out.println("addTeamsWebsite");
        String website = "www.lakers.com";
        SoapTeamImplService instance = new SoapTeamImplService();
        String expResult = "new website added: " + website;
        String result = instance.addTeamsWebsite(website);
        assertEquals(expResult, result);
    }

    /**
     * Test of addNewPlayer method, of class SoapTeamImplService.
     */
    @Test
    public void testAddNewPlayer() {
        System.out.println("addNewPlayer");
        Player newPlayer = new Player();
        newPlayer.setPlayerName("Marc");
        newPlayer.setPlayerSurname("Gasol");
        newPlayer.setPlayerAge(34);
        newPlayer.setPosition("C");
        newPlayer.setHeight(206);
        newPlayer.setWeight(120);
        SoapTeamImplService instance = new SoapTeamImplService();
        Player expResult = newPlayer;
        Player result = instance.addNewPlayer(newPlayer);
        assertEquals(expResult, result);
    }

    /**
     * Test of removePlayer method, of class SoapTeamImplService.
     */
    @Test
    public void testRemovePlayer() {
        System.out.println("removePlayer");
        String name = "Dainoras";
        String surname = "Ziukass";
        SoapTeamImplService instance = new SoapTeamImplService();
        String expResult = "Player not found";
        String result = instance.removePlayer(name, surname);
        assertEquals(expResult, result);
    }

    /**
     * Test of getPlayers method, of class SoapTeamImplService.
     * @throws javax.xml.bind.JAXBException
     * @throws java.io.IOException
     */
    @Test
    public void testGetPlayers() throws JAXBException, IOException {
        System.out.println("getPlayers");
        SoapTeamImplService instance = new SoapTeamImplService();
        Transformation transformation = new Transformation();
        Team team = transformation.transformToPOJO("team.xml");
        Players expResult = team.getPlayers();
        Players result = team.getPlayers();
        assertEquals(expResult, result);
    }
    
}
