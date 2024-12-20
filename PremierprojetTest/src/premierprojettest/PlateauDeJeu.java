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
    Combinaison combinaisonDuMaitre;
    ArrayList <Combinaison> tentatives; // Garde en memoir les differentes combinaisons du joueuer
    ArrayList <String> reponses;
    int nbToursMax;
    int nbTentatives=0;

    // Constructeur
    public PlateauDeJeu(Combinaison combinaisonDuMaitre, int nbToursMax) {
        this.combinaisonDuMaitre = combinaisonDuMaitre;
        this.nbToursMax = nbToursMax;
        tentatives = new ArrayList();
        reponses = new ArrayList();
    }
       
    //Ajoute une tentative et calcule les indices correspondants.
    public void proposerCombinaison(Combinaison autre){
        int[] laReponse = new int[2];   // reponse au format de retour de la methode Combinasion.comparer
        String laReponseStr;            // reponse au format String
        
        tentatives.add(autre);
        nbTentatives++;
        laReponse=combinaisonDuMaitre.comparer(autre);
        laReponseStr="Noirs:"+Integer.toString(laReponse[0]) + " Blancs:"+Integer.toString(laReponse[1]); // conversion en string
        reponses.add(laReponseStr);
    }
    
    public void afficherPlateau(){
        System.out.println("Tentatives : "+ tentatives.toString());
        System.out.println("Reponses : "+ reponses.toString());
    }
    
    public Boolean estVictoire(){
        String derniereReponse = reponses.getLast();
        if (derniereReponse.equals("Noirs:4 Blancs:0")){  //equals permet de comparer deux string
           System.out.println("Congratulation ! You win !");
           return true;
        }
        else {
           System.out.println("Dommage, essaye encore");
           return false;
        }
    }
     
    public Boolean gameOver(){
        if (nbTentatives==nbToursMax){
            System.out.println("Game Over");
            return true;
        }
        else return false;
    }
}
