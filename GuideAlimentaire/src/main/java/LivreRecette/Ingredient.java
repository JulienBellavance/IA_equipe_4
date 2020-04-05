/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LivreRecette;

/**
 *
 * @author Pascal Cantin
 */

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "ingredient")
@XmlAccessorType(XmlAccessType.PROPERTY)

public class Ingredient implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    private String nom;
    private int quantite;
    private String uniteMesure;
    
    Ingredient(String leNom, int quant, String unite){
        this.nom = leNom;
        this.quantite = quant;
        this.uniteMesure = unite;
    }

    public String getNom() {
        return nom;
    }

    public int getQuantite() {
        return quantite;
    }

    public String getUniteMesure() {
        return uniteMesure;
    }
}
