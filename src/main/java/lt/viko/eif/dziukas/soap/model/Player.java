/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lt.viko.eif.dziukas.soap.model;

import javax.xml.bind.annotation.XmlElement;

/**
 * Represents Player object that is in Players object and it represents single
 * basketball player information like playerName, playerSurname, playerAge,
 * position, height and weight.
 *
 * @author Dainoras
 * @version 1.0
 * @since 1.0
 */
public class Player {

    private String playerName;
    private String playerSurname;
    private Integer playerAge;
    private String position;
    private Integer height;
    private Integer weight;

    /**
     * Gets players name.
     *
     * @return the name.
     */
    @XmlElement(name = "player-name")
    public String getPlayerName() {
        return playerName;
    }

    /**
     * Players name setter method.
     *
     * @param playerName the players name.
     */
    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    /**
     * Gets players surname.
     *
     * @return the surname.
     */
    @XmlElement(name = "player-surname")
    public String getPlayerSurname() {
        return playerSurname;
    }

    /**
     * Players surname setter method.
     *
     * @param playerSurname the players surname.
     */
    public void setPlayerSurname(String playerSurname) {
        this.playerSurname = playerSurname;
    }

    /**
     * Gets players age.
     *
     * @return the age.
     */
    @XmlElement(name = "player-age")
    public Integer getPlayerAge() {
        return playerAge;
    }

    /**
     * Players age setter method.
     *
     * @param playerAge the players age.
     */
    public void setPlayerAge(Integer playerAge) {
        this.playerAge = playerAge;
    }

    /**
     * Gets players position in which he plays.
     *
     * @return the players position in game.
     */
    public String getPosition() {
        return position;
    }

    /**
     * Players position setter method.
     *
     * @param position the players position in which he plays in game.
     */
    public void setPosition(String position) {
        this.position = position;
    }

    /**
     * Gets players current height.
     *
     * @return the height of a player.
     */
    public Integer getHeight() {
        return height;
    }

    /**
     * Players height setter method.
     *
     * @param height the current height.
     */
    public void setHeight(Integer height) {
        this.height = height;
    }

    /**
     * Gets players current weight.
     *
     * @return the weight of a player.
     */
    public Integer getWeight() {
        return weight;
    }

    /**
     * Players weight setter method.
     *
     * @param weight the current weight.
     */
    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    /**
     * To String method that formats the player object parameters for printing.
     *
     * @return the string with players information.
     */
    @Override
    public String toString() {
        return String.format("\n\t\t\tplayerName: %s \n\t\t\tplayerSurname: %s \n\t\t\tplayerAge: %s \n\t\t\ttposition: %s \n\t\t\theight: %s \n\t\t\tweight: %s \n", playerName, playerSurname, playerAge, position, height, weight);
    }

}
