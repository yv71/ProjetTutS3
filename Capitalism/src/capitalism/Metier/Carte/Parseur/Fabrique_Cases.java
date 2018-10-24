/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capitalism.Metier.Carte.Parseur;

import capitalism.Metier.Carte.Cases.Case;
import capitalism.Metier.Carte.Cases.TypeCase;
import capitalism.Metier.Carte.Map;

/**
 * Fabrique des cases
 * @author Matthieu
 */
public class Fabrique_Cases {

    //singleton
    private static Fabrique_Cases instance;
    
//---------- CONSTRUCTEURS -----------------------------------------------------
    private Fabrique_Cases() {
    }
//------------------------------------------------------------------------------

//---------- GETEUR/SETEUR -----------------------------------------------------
    public static Fabrique_Cases get(Map _map) {
        if(instance == null) {
            instance = new Fabrique_Cases();
        }
        return instance;
    }
//------------------------------------------------------------------------------

    //construction d'une case
    public static Case construireCase(TypeCase type,int ligne,int colonne,Map map) {
        Case nouvelleCase = null;
        switch(type) {
            case CaseEau: throw new UnsupportedOperationException();
        }
        return nouvelleCase;
    }
}