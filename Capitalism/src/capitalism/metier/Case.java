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
public abstract class Case {
    
    private Coordonnee coordonnees;
    private Map map;

    public abstract TypeCase getType();

    /**
     * 
     * @param coordonnees
     * @param map 
     */
    public Case(Coordonnee coordonnees, Map map) {
        this.coordonnees=coordonnees;
        this.map=map;
    }

    public Coordonnee getCoordonnees() {
        return coordonnees;
    }

    public void setCoordonnees(Coordonnee coordonnees) {
        this.coordonnees = coordonnees;
    }

    public Map getMap() {
        return map;
    }

    public void setMap(Map map) {
        this.map = map;
    }
    
}