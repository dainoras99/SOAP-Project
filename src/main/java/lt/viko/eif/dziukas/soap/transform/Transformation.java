/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lt.viko.eif.dziukas.soap.transform;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import lt.viko.eif.dziukas.soap.model.Team;

/**
 * Represents Transformation class where transformation happens and it
 * has two functions transformToXml and transformToPojo
 * 
 * @author Dainoras
 * @version 1.0
 * @since 1.0
 */
public class Transformation {
    
    /**
     * Transformation class method which transforms Team object
     * to the xml file and prints it
     * @param team the team players
     * @throws JAXBException
     * @throws FileNotFoundException 
     */
    public void transformToXml(Team team) throws JAXBException, FileNotFoundException 
    {
        JAXBContext jaxbContext = JAXBContext.newInstance(Team.class);

        Marshaller marshaller = jaxbContext.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        
        marshaller.marshal(team, new FileOutputStream("team.xml"));
        
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
 
        StringWriter xmlWriter = new StringWriter();
        marshaller.marshal(team, xmlWriter);
        
    }
    
    /**
     * Transformation class method which transforms xml file
     * to the POJO
     * @param fileName the name of the xml file
     * @return the team object
     * @throws JAXBException
     * @throws IOException 
     */
 public Team transformToPOJO(String fileName) throws JAXBException, IOException
    {
        JAXBContext jaxbContext = JAXBContext.newInstance(Team.class);
        Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
        Path path = Path.of(fileName);
        
        String actual = Files.readString(path);
        
        StringReader reader = new StringReader(actual);
        Team team = (Team) unmarshaller.unmarshal(reader);
        
        return team;
    }
}
