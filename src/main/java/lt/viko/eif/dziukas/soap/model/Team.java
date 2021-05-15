/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lt.viko.eif.dziukas.soap.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Represents team object from National Basketball Association (NBA), which
 * consists of attributes named teamName, location, conference, division,
 * founded, titleCount, and it also has 3 objects named - teamColors, headCoach
 * and players
 *
 * @author Dainoras
 * @version 1.0
 * @since 1.0
 */
@XmlRootElement
public class Team {

    private String teamName;
    private String location;
    private String conference;
    private String division;
    private Integer founded;
    private Integer titleCount;
    private String arena;
    private TeamColors teamColors;
    private HeadCoach headCoach;
    private Players players;
    private String website;

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    /**
     * Gets the teams current location (city).
     *
     * @return the location.
     */
    public String getLocation() {
        return location;
    }

    /**
     * Location setter method.
     *
     * @param location the teams location (city).
     */
    public void setLocation(String location) {
        this.location = location;
    }

    /**
     * Gets the teams name.
     *
     * @return the teams name.
     */
    @XmlElement(name = "team-name")
    public String getTeamName() {
        return teamName;
    }

    /**
     * Teams name setter method.
     *
     * @param teamName the teams name.
     */
    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    /**
     * Gets conference in which team belongs to.
     *
     * @return the conference.
     */
    public String getConference() {
        return conference;
    }

    /**
     * Conference setter method.
     *
     * @param conference the conference.
     */
    public void setConference(String conference) {
        this.conference = conference;
    }

    /**
     * Gets division in which team belongs to.
     *
     * @return the division.
     */
    public String getDivision() {
        return division;
    }

    /**
     * Division setter method.
     *
     * @param division the division.
     */
    public void setDivision(String division) {
        this.division = division;
    }

    /**
     * Gets the specific year when the team was founded.
     *
     * @return year, when team was founded.
     */
    public Integer getFounded() {
        return founded;
    }

    /**
     * Founded setter method.
     *
     * @param founded the year it was founded.
     */
    public void setFounded(Integer founded) {
        this.founded = founded;
    }

    /**
     * Gets the number of titles won in the NBA.
     *
     * @return number of titles.
     */
    @XmlElement(name = "title-count")
    public Integer getTitleCount() {
        return titleCount;
    }

    /**
     * Title count setter method.
     *
     * @param titleCount the number of titles.
     */
    public void setTitleCount(Integer titleCount) {
        this.titleCount = titleCount;
    }

    /**
     * Gets the arena where team plays their home games.
     *
     * @return the arena name.
     */
    public String getArena() {
        return arena;
    }

    /**
     * Arena setter method.
     *
     * @param arena the arena name.
     */
    public void setArena(String arena) {
        this.arena = arena;
    }

    /**
     * Gets official teams colors.
     *
     * @return all colors of the team.
     */
    @XmlElement(name = "team-colors")
    public TeamColors getTeamColors() {
        return teamColors;
    }

    /**
     * Team colors setter method.
     *
     * @param teamColors the colors of the team.
     */
    public void setTeamColors(TeamColors teamColors) {
        this.teamColors = teamColors;
    }

    /**
     * Gets teams head coach information.
     *
     * @return head coach information.
     */
    @XmlElement(name = "head-coach")
    public HeadCoach getHeadCoach() {
        return headCoach;
    }

    /**
     * Head coach setter method.
     *
     * @param headCoach the teams head coach.
     */
    public void setHeadCoach(HeadCoach headCoach) {
        this.headCoach = headCoach;
    }

    /**
     * Gets each teams player information.
     *
     * @return each player information.
     */
    public Players getPlayers() {
        return players;
    }

    /**
     * Players setter method.
     *
     * @param players the teams each player.
     */
    public void setPlayers(Players players) {
        this.players = players;
    }

    /**
     * To String method that formats all team object parameters for printing.
     *
     * @return the string with team information.
     */
    @Override
    public String toString() {
        return String.format("\nTeam: \n\tteamName: %s \n\tlocation: %s \n\tconference: %s \n\tdivision: %s \n\tfounded: %s \n\ttitleCount: %s \n\tarena: %s \n\tteamColors: %s \n\theadCoach: %s \n\tplayers: %s", teamName, location, conference, division, founded, titleCount, arena, teamColors, headCoach, players);
    }
}
