/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capitalism.metier;

/**
 *
 * @author Damien
 * Classe repr�sentant les entreprises du jeu
 */
public class Entreprise {

	private String Nom;
	private int Argent;
	private Image Logo;
	private Jeu Jeu;
	/**
	 * Type : HashMap<Ressources,int>
	 */
	private int RessourcesPossedees;

	/**
	 * 
	 * @param Nom
	 * @param Logo
	 * @param Jeu
	 */
	public Entreprise(String Nom, Image Logo, Jeu Jeu) {
		// TODO - implement Entreprise.Entreprise
		throw new UnsupportedOperationException();
	}

	public void dissoudre() {
		// TODO - implement Entreprise.dissoudre
		throw new UnsupportedOperationException();
	}

	public void passerTour() {
		// TODO - implement Entreprise.passerTour
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param cible
	 * @param prixParTour
	 * @param RessourceDemandee
	 * @param qteDemandee
	 */
	public void proposerContratVente(Entreprise cible, int prixParTour, Ressources RessourceDemandee, int qteDemandee) {
		// TODO - implement Entreprise.proposerContratVente
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param cible
	 * @param ressourceProposee
	 * @param qteProposee
	 * @param RessourceDemandee
	 * @param qteDesiree
	 */
	public void proposerContratEchange(Entreprise cible, Ressources ressourceProposee, int qteProposee, Ressources RessourceDemandee, int qteDesiree) {
		// TODO - implement Entreprise.proposerContratEchange
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param Contrat
	 */
	public void ajouterContratEnAttente(Contrat Contrat) {
		// TODO - implement Entreprise.ajouterContratEnAttente
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param Contrat
	 */
	public void ajouterContratSource(Contrat Contrat) {
		// TODO - implement Entreprise.ajouterContratSource
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param Contrant
	 */
	public void ajouterContratDest(Contrat Contrant) {
		// TODO - implement Entreprise.ajouterContratDest
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param contrat
	 */
	public void accepterContratEnAttente(Contrat contrat) {
		// TODO - implement Entreprise.accepterContratEnAttente
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param contrat
	 */
	public void refuserContratEnAttente(Contrat contrat) {
		// TODO - implement Entreprise.refuserContratEnAttente
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param contrat
	 */
	public void annulerContrat(Contrat contrat) {
		// TODO - implement Entreprise.annulerContrat
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param Contrat
	 */
	public void supprimerContrat(Contrat Contrat) {
		// TODO - implement Entreprise.supprimerContrat
		throw new UnsupportedOperationException();
	}

	public void r�cupererArgentContrat() {
		// TODO - implement Entreprise.r�cupererArgentContrat
		throw new UnsupportedOperationException();
	}

	public void r�cupererRessourcesContrat() {
		// TODO - implement Entreprise.r�cupererRessourcesContrat
		throw new UnsupportedOperationException();
	}

	public int afficherArgent() {
		// TODO - implement Entreprise.afficherArgent
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param usine
	 */
	public void demolirUsine(Usine usine) {
		// TODO - implement Entreprise.demolirUsine
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param Emplacement
	 */
	public void creerUsine(CaseEmplacement Emplacement) {
		// TODO - implement Entreprise.creerUsine
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param Usine
	 * @param NouveauProprietaire
	 * @param prix
	 */
	public void vendreUsine(usine Usine, Entreprise NouveauProprietaire, int prix) {
		// TODO - implement Entreprise.vendreUsine
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param Usine
	 */
	public void nouvelleUsine(usine Usine) {
		// TODO - implement Entreprise.nouvelleUsine
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param qteArgent
	 */
	public void ajouterAgent(int qteArgent) {
		// TODO - implement Entreprise.ajouterAgent
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param qteArgent
	 * @param EntrepriseCible
	 */
	public void donnerArgent(int qteArgent, Entreprise EntrepriseCible) {
		// TODO - implement Entreprise.donnerArgent
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param qteArgent
	 */
	public void perdreArgent(int qteArgent) {
		// TODO - implement Entreprise.perdreArgent
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param EntreprisePartenaire
	 */
	public ArrayList<Contrat> getContrats(Entreprise EntreprisePartenaire) {
		// TODO - implement Entreprise.getContrats
		throw new UnsupportedOperationException();
	}

	public void payerFrais() {
		// TODO - implement Entreprise.payerFrais
		throw new UnsupportedOperationException();
	}

	public int getArgentDepenseParContrat() {
		// TODO - implement Entreprise.getArgentDepenseParContrat
		throw new UnsupportedOperationException();
	}

	/**
	 * return une hashMap de ressources
	 */
	public void getRessourcesPerduesParContrat() {
		// TODO - implement Entreprise.getRessourcesPerduesParContrat
		throw new UnsupportedOperationException();
	}

	/**
	 * Recois une hashMap de ressources
	 */
	public void supprimerRessources() {
		// TODO - implement Entreprise.supprimerRessources
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param Ressource
	 * @param qte
	 */
	public void supprimerRessource(ressource Ressource, int qte) {
		// TODO - implement Entreprise.supprimerRessource
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param Ressource
	 * @param qte
	 */
	public void ajouterRessources(Ressources Ressource, int qte) {
		// TODO - implement Entreprise.ajouterRessources
		throw new UnsupportedOperationException();
	}

}