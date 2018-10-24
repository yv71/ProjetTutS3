/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capitalism.metier;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author Damien
 */
public class Map {

    private Jeu jeu;
    private HashMap<Coordonnee,Case> hashMapCases;
    private ArrayList<Case> listeCases;

    public Map(Jeu jeu, HashMap<Coordonnee, Case> hashMapCases, ArrayList<Case> listeCases) {
        this.jeu = jeu;
        this.hashMapCases = new HashMap();
        this.listeCases = new ArrayList();
    }

    public Jeu getJeu() {
        return jeu;
    }

    public void setJeu(Jeu jeu) {
        this.jeu = jeu;
    }

    public HashMap<Coordonnee, Case> getHashMapCases() {
        return hashMapCases;
    }

    public void setHashMapCases(HashMap<Coordonnee, Case> hashMapCases) {
        this.hashMapCases = hashMapCases;
    }

    public ArrayList<Case> getListeCases() {
        return listeCases;
    }

    public void setListeCases(ArrayList<Case> listeCases) {
        this.listeCases = listeCases;
    }
    
}