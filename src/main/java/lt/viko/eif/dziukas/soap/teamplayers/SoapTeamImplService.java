/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lt.viko.eif.dziukas.soap.teamplayers;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.jws.WebService;
import javax.xml.bind.JAXBException;
import lt.viko.eif.dziukas.soap.model.Player;
import lt.viko.eif.dziukas.soap.model.Players;
import lt.viko.eif.dziukas.soap.model.Team;
import lt.viko.eif.dziukas.soap.transform.Transformation;


/**
 * Represents services implementation through SoapTeam interface
 * and that consists of multiple methods
 * 
 * @author Dainoras
 * @version 1.0
 * @since 1.0
 */
@WebService(endpointInterface = "lt.viko.eif.dziukas.soap.teamplayers.SoapTeam")
public class SoapTeamImplService implements SoapTeam {
    
    private Team transformToPOJO() {
        Team team = new Team();
        Transformation transformation = new Transformation();
        try {
            team = transformation.transformToPOJO("team.xml");
        } catch (JAXBException | IOException ex) {
            Logger.getLogger(SoapTeamImplService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return team;
    }
    private void transformToXML(Team team) {
        try {
            Transformation transformation = new Transformation();
            transformation.transformToXml(team);
        } catch (JAXBException | FileNotFoundException ex) {
            Logger.getLogger(SoapTeamImplService.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    /**
     * Method that gets whole team object
     * 
     * @return team object
     */
    @Override
    public Team getTeam() {
        Team team;
        team = transformToPOJO();
        return team;
    }
    /**
     * Method that updates teams name
     * 
     * @param name teams name
     * @return new team name
     */
    @Override
    public String updateTeamName(String name) {
        Team team = transformToPOJO();
        team.setTeamName(name);
        transformToXML(team);
        return team.getTeamName() + " - New team name";
    }
    /**
     * Method that adds teams internet website
     * 
     * @param website teams website
     * @return newly changed website address
     */
    @Override
    public String addTeamsWebsite(String website) {
        Team team = transformToPOJO();
        team.setWebsite(website);
        transformToXML(team);
        return "new website added: " + team.getWebsite();
    }
    /**
     * Method that adds new player to the xml document
     * 
     * @param newPlayer new teams player
     * @return newly created teams player
     */
    @Override
    public Player addNewPlayer(Player newPlayer) {
        Team team = transformToPOJO();
        Player player = newPlayer;
        Players players = team.getPlayers();
        List<Player> playersList = players.getPlayer();
        playersList.add(player);
        players.setPlayer(playersList);
        team.setPlayers(players);
        transformToXML(team);
        
        return player;
        
    }
    /**
     * Method that removes selected teams player from the xml document
     * 
     * @param name team player name
     * @param surname team player surname
     * @return the information that player is removed or that player is not found
     */
    @Override
    public String removePlayer(String name, String surname) {
        Team team = transformToPOJO();
        Players players = team.getPlayers();
        
        List<Player> playersList = players.getPlayer();
        List<Player> removablePlayersList = players.getPlayer();
        
       
        for (Player player : playersList) {
            System.out.println(player);
            if (player.getPlayerName().equals(name) && player.getPlayerSurname().equals(surname)) {
                removablePlayersList.remove(player);
                players.setPlayer(removablePlayersList);
                team.setPlayers(players);
                transformToXML(team);
                return "This player is removed!";
            }
        }
        return "Player not found";
    }
    /**
     * Method that gets all team players
     * 
     * @return team players
     */
    @Override
    public Players getPlayers() {
        Team team;
        team = transformToPOJO();
        Players players = team.getPlayers();
        return players;
    }
}
