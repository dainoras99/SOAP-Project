/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lt.viko.eif.dziukas.soap.model;

import java.util.List;

/**
 * Represents Players object that is in Team object 
 * and it represents player list of all 10 team players.
 * 
 * @author Dainoras
 * @version 1.0
 * @since 1.0
 */
public class Players {
    private List<Player> player;

    /**
     * Gets List of the teams players.
     * 
     * @return the players list.
     */
    public List<Player> getPlayer() {
        return player;
    }

    /**
     * Player setter method.
     * 
     * @param player the teams player.
     */
    public void setPlayer(List<Player> player) {
        this.player = player;
    }
    
    /**
     * To String method that formats player list
     * object parameter for printing.
     * 
     * @return the string with players.
     */
    @Override
    public String toString() {
         return String.format("\n\t\t player:%s", player);
    }

    

    
    
    
}
