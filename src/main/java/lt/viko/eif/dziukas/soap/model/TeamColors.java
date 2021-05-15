/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lt.viko.eif.dziukas.soap.model;

import java.util.List;
import javax.xml.bind.annotation.XmlElement;

/**
 * Represents TeamColors object that is in Team object and it represents
 * teamColor list of existing official team colors.
 *
 * @author Dainoras
 * @version 1.0
 * @since 1.0
 */
public class TeamColors {
    
    private List<String> teamColor;

    /**
     * Gets list of team colors.
     * 
     * @return the colors of the team.
     */
    @XmlElement(name = "team-color")
    public List<String> getTeamColor() {
        return teamColor;
    }

    /**
     * TeamColor setter method.
     * 
     * @param teamColor the teams color.
     */
    public void setTeamColor(List<String> teamColor) {
        this.teamColor = teamColor;
    }

    /**
     * To String method that formats TeamColors
     * object parameter for printing.
     * 
     * @return the string with team colors.
     */
    @Override
    public String toString() {
        return String.format("\n\t\tteamColor%s", teamColor);
    }
    
}


