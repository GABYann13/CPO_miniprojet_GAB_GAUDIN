/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package premierprojettest;

import java.util.ArrayList;
import Combinaison.java;

/**
 *
 * @author kango
 */
public class PlateauDeJeu {
    Combinaison CombinaisonDuMaitre;
    ArrayList <Combinaison> Tentatives; // Garde en memoir les differentes combinaisons du joueuer
    ArrayList <Character> UneCombinaison; // Creation d'une liste pour devenir la tentative du joueur 
     ArrayList <String> reponses;
     int nbToursMax;
     int nbTentatives=0;
     
     int taille2 = combinaison.size(); // import de la classe Combinaison puis creation de la taille d'une combinaison
     
     //Creation d'une liste qui prends 4 couleures pour creer une tentative du joueur
     
     for (int i=0; i<taille2 ; i++ ){
        
        
        
    
}
     UneCombinaison.add();
     
     Tentatives.add(UneCombinaison);

    public PlateauDeJeu(Combinaison CombinaisonDuMaitre, int nbToursMax) {
        this.CombinaisonDuMaitre = CombinaisonDuMaitre;
        this.nbToursMax = nbToursMax;
    }
    
    public proposerCombinaison(Combinaison autre){
        if ("bouton validé apuuyé"){
        nbTentatives = nbTentatives+1;
        
        
    }
    }
    
    public afficherPlateau(){
        
    }
    
    public Victoire(){
       if (CombinaisonDuMaitre==Tentatives){
           System.out.println("Congratulation ! You win !");
       }
 
    }
     
    public Game_Over(){
        if (nbTentatives==nbToursMax){
            System.out.println("Game Over");
        }
        
    } 
    
    
    
    
    
}
