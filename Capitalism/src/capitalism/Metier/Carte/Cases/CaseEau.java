/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capitalism.Metier.Carte.Cases;

import capitalism.Metier.Carte.Map;

/**
 *
 * @author Damien
 */
public class CaseEau extends Case {
    
//---------- CONSTRUCTEURS -----------------------------------------------------
    
    public CaseEau(int ligne, int colonne, Map map) {
        super(ligne, colonne, map);
    }
    
//------------------------------------------------------------------------------

//---------- GETEUR/SETEUR -----------------------------------------------------
    
    @Override
    public TypeCase getType() {
        return TypeCase.CaseEau;
    }
    
//------------------------------------------------------------------------------
    
}