/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LivreRecette;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author Pascal Cantin
 */

@XmlRootElement(name = "livreRecette")
@XmlAccessorType(XmlAccessType.PROPERTY)

public class LivreRecette implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    private List<Recette> listeRecette;

    public List<Recette> getListeRecette() {
        return listeRecette;
    }
    
    LivreRecette (){
        this.listeRecette = new ArrayList<Recette>();
    }
    
    public void ajouteRecette(Recette laRecette){
        listeRecette.add(laRecette);
    }
    
    public void importerRecettes (){
        
    }
    
}
