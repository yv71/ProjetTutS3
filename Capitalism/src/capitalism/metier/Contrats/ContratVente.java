/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capitalism.metier.Contrats;

import capitalism.metier.Entreprises.Entreprise;
import capitalism.metier.Ressources;

/**
 *
 * @author Damien
 */
public class ContratVente extends Contrat {

    private int prix;
    private Ressources ressourceSource;
    private int qteSource;

    public ContratVente(Entreprise entSource, Entreprise entDestinataire, int duree, Ressources ressourceSource, int qteSource, int prix) {
        super(entSource, entDestinataire, duree);
        this.prix=prix;
        this.qteSource=qteSource;
        this.ressourceSource=ressourceSource;
    }

    @Override
    public TypeContrat getTypeContrat() {
        return TypeContrat.Vente;
    }

    public int getPrix() {
        return prix;
    }

    public void setPrix(int prix) {
        this.prix = prix;
    }

    public Ressources getRessourceSource() {
        return ressourceSource;
    }

    public void setRessourceSource(Ressources ressourceSource) {
        this.ressourceSource = ressourceSource;
    }

    public int getQteSource() {
        return qteSource;
    }

    public void setQteSource(int qteSource) {
        this.qteSource = qteSource;
    }

}