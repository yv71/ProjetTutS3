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
public class CaseEmplacement extends Case {

    private Usine usine;

    public CaseEmplacement(Coordonnee coordonnees, Map map) {
        super(coordonnees, map);
        this.usine=null;
    }

    @Override
    public TypeCase getType() {
        return TypeCase.CaseEmplacement;
    }

    public Usine getUsine() {
        return usine;
    }

    public void setUsine(Usine usine) {
        this.usine = usine;
    }
    /**
     * 
     * @return Vrai si une usine est déjà construite sur cette case et Faux dans le cas contraire
     */
    public boolean estOccupe(){
        return this.getUsine()!=null;
    }
}