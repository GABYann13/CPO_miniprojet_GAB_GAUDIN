/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package premierprojettest;

import java.util.ArrayList;

/**
 *
 * @author kango
 */
public class PlateauDeJeu {
    Combinaison CombinaisonDuMaitre;
    ArrayList <Combinaison> tentatives;
     ArrayList <String> reponses;
     int nbToursMax;

    public PlateauDeJeu(Combinaison CombinaisonDuMaitre, int nbToursMax) {
        this.CombinaisonDuMaitre = CombinaisonDuMaitre;
        this.nbToursMax = nbToursMax;
    }
    
    public proposerCombinaison(Combinaison autre){
        if ("bouton validé apuuyé"){
        nbToursMax = nbToursMax-1;
        
    }
    }
    
    public afficherPlateau(){
        
    }
    
    public Victoire(){
        
    }
     
    public Game_Over(){
        if (nbToursMax==0){
            System.out.println("Game Over");
        }
        
    } 
    
    
    
    
    
}
