/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capitalism.metier.Carte.Cases;

import capitalism.metier.Carte.Map;
import capitalism.metier.Ressources;

/**
 *
 * @author Damien
 */
public class CaseRessource extends Case {

    private Ressources ressource;

    public CaseRessource(int ligne, int colonne, Map map) {
        super(ligne, colonne, map);
        this.ressource=null;
    }

    @Override
    public TypeCase getType() {
        return TypeCase.CaseRessource;
    }

    public Ressources getRessource() {
        return ressource;
    }

    public void setRessource(Ressources ressource) {
        this.ressource = ressource;
    }
    
}