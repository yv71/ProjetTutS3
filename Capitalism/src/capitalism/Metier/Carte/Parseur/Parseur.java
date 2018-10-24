/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capitalism.Metier.Carte.Parseur;

import capitalism.Metier.Carte.Map;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Damien
 */
public class Parseur {
    
    private final String adresseFichier;
    private Map map;
    
//---------- CONSTRUCTEURS -----------------------------------------------------
    
    public Parseur(String adresseFichier, Map map) {
        this.adresseFichier = adresseFichier;
        this.map = map;
    }
    
//------------------------------------------------------------------------------

    //Lance le parsage du fichier
    public void lecture() throws FileNotFoundException, IOException {
        
        //ouverture du fichier en lecture
        File file = new File(this.adresseFichier);
        BufferedReader fichier = new BufferedReader(new FileReader(file));
        
        throw new UnsupportedOperationException();
    }
    
    //Parse le fichier
    public void parse(){
        throw new UnsupportedOperationException();
    }
}
