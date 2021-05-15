/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lt.viko.eif.dziukas.soap.model;

import javax.xml.bind.annotation.XmlElement;

/**
 * Represents HeadCoach object that is in Team object 
 * and it represents teams head coach information like
 * his name, surname and age
 * 
 * @author Dainoras
 * @version 1.0
 * @since 1.0
 */
public class HeadCoach {
    
    private String coachName;
    private String coachSurname;
    private Integer coachAge;

    /**
     * Gets head coaches name.
     * 
     * @return the head coach name.
     */
    @XmlElement(name = "coach-name")
    public String getCoachName() {
        return coachName;
    }

    /**
     * Coach name setter method.
     * 
     * @param coachName the coaches name.
     */
    public void setCoachName(String coachName) {
        this.coachName = coachName;
    }

    /**
     * Gets head coaches surname.
     * 
     * @return the head coach surname.
     */
    @XmlElement(name = "coach-surname")
    public String getCoachSurname() {
        return coachSurname;
    }

    /**
     * Coach name setter method.
     * 
     * @param coachSurname the coaches surname.
     */
    public void setCoachSurname(String coachSurname) {
        this.coachSurname = coachSurname;
    }

    /**
     * Gets head coaches age.
     * 
     * @return the head coach age.
     */
    @XmlElement(name = "coach-age")
    public Integer getCoachAge() {
        return coachAge;
    }

    /**
     * Coach age setter method.
     * 
     * @param coachAge  the coaches age.
     */
    public void setCoachAge(Integer coachAge) {
        this.coachAge = coachAge;
    }

    /**
     * To String method that formats head coach 
     * object parameters for printing.
     * 
     * @return the string with head coach information.
     */
    @Override
    public String toString() {
        return String.format("\n\t\tcoachName: %s \n\t\tcoachSurname:%s \n\t\tcoachAge: %s", coachName, coachSurname, coachAge);
    }
}
