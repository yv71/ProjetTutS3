/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capitalism.metier.Carte.Cases;

import capitalism.metier.Carte.Map;

/**
 *
 * @author Damien
 */
public class CaseTerre extends Case {

    public CaseTerre(int ligne, int colonne, Map map) {
        super(ligne, colonne, map);
    }

    @Override
    public TypeCase getType() {
        return TypeCase.CaseTerre;
    }
}