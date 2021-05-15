/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lt.viko.eif.dziukas.soap.teamplayers;

import javax.xml.ws.Endpoint;

/**
 * Represents main class with localhost endpoint
 * 
 * @author Dainoras
 * @version 1.0
 * @since 1.0
 */
public class JAXWS1 {
    /**
     * Main method with localhost endpoint implementation
     * 
     * @param args 
     */
    public static void main(String[] args) {
        Endpoint.publish(
        "http://localhost:5052/PlayersList/players",
        new SoapTeamImplService());
    }
}
