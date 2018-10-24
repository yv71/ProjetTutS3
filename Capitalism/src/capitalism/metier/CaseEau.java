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
public class CaseEau extends Case {

    public CaseEau(Coordonnee coordonnees, Map map) {
        super(coordonnees, map);
    }

    @Override
    public TypeCase getType() {
        return TypeCase.CaseEau;
    }
}