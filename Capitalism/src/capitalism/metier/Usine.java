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
public abstract class Usine {

	private String Nom;
	private Entreprise Proprietaire;

	/**
	 * 
	 * @param nouveauNom
	 */
	public void changerNom(String nouveauNom) {
		// TODO - implement Usine.changerNom
		throw new UnsupportedOperationException();
	}

	public void vendre() {
		// TODO - implement Usine.vendre
		throw new UnsupportedOperationException();
	}

	public abstract void produire();

	/**
	 * 
	 * @param Nom
	 * @param Proprietaire
	 */
	public Usine(String Nom, Entreprise Proprietaire) {
		// TODO - implement Usine.Usine
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param NouveauProprietaire
	 */
	public void vendreUsine(Entreprise NouveauProprietaire) {
		// TODO - implement Usine.vendreUsine
		throw new UnsupportedOperationException();
	}

}