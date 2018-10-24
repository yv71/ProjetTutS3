/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capitalism.metier;

/**
 *
 * @author Damien
 */
public abstract class Contrat {

	private Entreprise Source;
	private Entreprise Destinataire;
	private int Duree;
	private Ressources RessourceDest;
	private int QteDest;

	/**
	 * 
	 * @param Source
	 * @param Destinataire
	 * @param Duree
	 */
	public Contrat(Entreprise Source, Entreprise Destinataire, int Duree) {
		// TODO - implement Contrat.Contrat
		throw new UnsupportedOperationException();
	}

	public abstract TypeContrat getTypeContrat();

	public int getQuantiteRessourcesEntrepriseDest() {
		// TODO - implement Contrat.getQuantiteRessourcesEntrepriseDest
		throw new UnsupportedOperationException();
	}

	public Ressources getRessourceDest() {
		// TODO - implement Contrat.getRessourceDest
		throw new UnsupportedOperationException();
	}

}