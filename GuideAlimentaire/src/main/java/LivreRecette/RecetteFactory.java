/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LivreRecette;

import java.io.File;
import javax.xml.bind.*;
import java.io.*;
import java.util.*;

/**
 *
 * @author Pascal Cantin
 */



public class RecetteFactory {
    
    //final DocumentBuilderFactory usine;
    //final DocumentBuilder constructeur;
    
    public void construire(){
        
        File xmlFile = new File("Data\recettes.xml");
        
        JAXBContext monContext;
        
        try{
            monContext = JAXBContext.newInstance(LivreRecette.class);
            Unmarshaller jaxbUnmarshaller = monContext.createUnmarshaller();
            LivreRecette monLivre = (LivreRecette) jaxbUnmarshaller.unmarshal(xmlFile);
        }catch (JAXBException e){
            
        }
        }
    
}
