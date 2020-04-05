/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LivreRecette;

import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Pascal Cantin
 */

@XmlRootElement(name = "recette")
@XmlAccessorType(XmlAccessType.PROPERTY)

public class Recette implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    private String nom;
    private String type;
    private List<String> listeCategories;
    private int tempsPreparation;
    private int tempsCuisson;
    private List<Ingredient> listeIngredients;
    private List<String> preparation;
    
    Recette(String leNom, String leType, List<String>listeCat, int tempsPrep, int tempsCuis, List<Ingredient> listeIng, List<String> prep){
        this.nom = leNom;
        this.type = leType;
        this.listeCategories = new ArrayList<String>(listeCat);
        this.tempsPreparation = tempsPrep;
        this.tempsCuisson = tempsCuis;
        this.listeIngredients = new ArrayList<Ingredient>(listeIng);
        this.preparation = new ArrayList<String>(prep);
    }

    public String getNom() {
        return nom;
    }

    public List<String> getListeCategories() {
        return listeCategories;
    }

    public int getTempsPreparation() {
        return tempsPreparation;
    }

    public int getTempsCuisson() {
        return tempsCuisson;
    }

    public List<Ingredient> getListeIngredients() {
        return listeIngredients;
    }

    public List<String> getPreparation() {
        return preparation;
    }
    
}
