/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lt.viko.eif.dziukas.soap.teamplayers;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import lt.viko.eif.dziukas.soap.model.Player;
import lt.viko.eif.dziukas.soap.model.Players;
import lt.viko.eif.dziukas.soap.model.Team;

/**
 * Represents SoapTeam interface where we set WebMethods getTeam,
 * updateTeamName, addTeamsWebsite, addNewPlayer, removePlayer and
 * getPlayers
 * 
 * @author Dainoras
 * @version 1.0
 * @since 1.0
 */
@WebService()
public interface SoapTeam {
    
    @WebMethod
    Team getTeam();
    
    @WebMethod
    String updateTeamName(@WebParam(name = "teamsName")String name);
    
    @WebMethod
    String addTeamsWebsite(@WebParam(name = "websiteLink")String website);
    
    @WebMethod
    Player addNewPlayer(@WebParam(name = "player")Player newPlayer);
    
    @WebMethod
    String removePlayer(@WebParam(name = "playersName")String name, @WebParam(name = "playersSurname")String surname);
    
    @WebMethod
    Players getPlayers();
}
