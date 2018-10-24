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
public class UsineProduit extends Usine {

    public UsineProduit(String nom, Entreprise proprietaire) {
        super(nom, proprietaire);
    }

    @Override
    public void produire() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}