/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capitalism.metier.Contrats;

import capitalism.metier.Entreprises.Entreprise;

/**
 *
 * @author Damien
 */
public abstract class Contrat {
    
    private Entreprise entSource;
    private Entreprise entDestinataire;
    private int duree;

    /**
    * 
    * @param entSource
    * @param entDestinataire
    * @param duree
    */
    public Contrat(Entreprise entSource, Entreprise entDestinataire, int duree) {
       this.duree=duree;
       this.entDestinataire=entDestinataire;
       this.entSource=entSource;
    }

    public abstract TypeContrat getTypeContrat();

    public Entreprise getEntSource() {
        return entSource;
    }

    public void setEntSource(Entreprise entSource) {
        this.entSource = entSource;
    }

    public Entreprise getEntDestinataire() {
        return entDestinataire;
    }

    public void setEntDestinataire(Entreprise entDestinataire) {
        this.entDestinataire = entDestinataire;
    }

    public int getDuree() {
        return duree;
    }

    public void setDuree(int duree) {
        this.duree = duree;
    }
}