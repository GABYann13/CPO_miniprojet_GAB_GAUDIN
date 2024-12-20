
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package premierprojettest;

import java.util.ArrayList;
import java.util.Random;
/**
 *
 * @author kango
 */
public class Combinaison {
    int taille;           
    Pion [] maCombinaison;
    
    // 1er Constructeur
    public Combinaison(Pion[] elements){
        taille=elements.length;
        maCombinaison = new Pion [taille];
        maCombinaison=elements;     
    } 
    
     // 2eme Constructeur qui cree une Combinaison vide, typiquement pour contenir un code aléatoire 
    public Combinaison(){
           // rien
    } 
    
    // Retourne la couleur d'un pion dont on indique la position en parametre
    public Character getCouleur(int nPion){
        return maCombinaison[nPion].getCouleur();
    }
    
    // génère une combinaison aléatoire de taille spécifiée, en sélectionnant des couleurs aléatoires parmi couleursDisponibles
    // A tester/revoir dans le cas ou cette methode est appelée sur une instance créé avec le 1er constructeur
    public void genererAleatoire(int laTaille, ArrayList<Character> couleursDisponibles) {
       taille=laTaille;
       maCombinaison = new Pion [taille];
       int nombreCouleursDispo = couleursDisponibles.size();
       Random NbrRandom = new Random();     
       int NbrAleatoire;
              
       for(int i=0 ; i<taille ; i++){
           NbrAleatoire = NbrRandom.nextInt(nombreCouleursDispo); 
           maCombinaison[i]=new Pion(couleursDisponibles.get(NbrAleatoire));       
        }
    }
          
    // on va retourner un nombre de pions Noirs (les biens placés) et un nombre de pions Blancs (les mal placés)
    public int[] comparer(Combinaison autre) {
        int pionNoir=0;                                 // Nb de bien placé
        int pionBlanc=0;                                // Nb de pions présents mais mal placés
        Boolean isPionNoir=false, isPionBlanc=false;    // utilisation de flags (mon père m'a expliqué cette ruse)
        int [] couleurs_indice = new int[2];            // resultat
        
        for (int i=0 ; i<taille ; i++){                 // j'itere sur la nouvelle combi 
            for (int j=0 ; j<taille ; j++){             // j'itere sur la combinaison maitre
                if (autre.maCombinaison[i].getCouleur()==maCombinaison[j].getCouleur()){      // je compare la tentative (autre.maCombinaison) à maCombinaison, qui est typiquement celle du maitre, 
                    if (i==j) isPionNoir=true;   // si la position est bonne
                    else isPionBlanc=true;       // sinon la couleur est bien presente mais pas à la bonne place
                }
            }
            if (isPionNoir)pionNoir++;          // si ce pion (de la nouvelle combi) a une ou plusieurs correspondance à la bonne position (par rapport à la combi maitre) alors on compte un seul Noir de plus (c'est la regle) 
            else if(isPionBlanc)pionBlanc++;    // si ce pion (de la nouvelle combi) a une ou plusieurs correspondance à une autre position (par rapport à la combi maitre) alors on compte un seul Blanc de plus 
            // on remet les flags de correspondance à 0, avant de repartir pour une comparaison avec le pion suivant de la nouvelle combinaison
            isPionNoir=false;
            isPionBlanc=false;
        }
        couleurs_indice[0]=pionNoir;        // je retourne le nombre de pions noirs
        couleurs_indice[1]=pionBlanc;       // je retourne le nombre de pions blancs
        return couleurs_indice;   
    }

    // Maintenant la methode toString peut retourner maCombinaison pour toutes les tailles demandées
    @Override
    public String toString() {
        String maStr = new String();
        maStr="Combinaison{";
        for (int i=0; i<taille; i++ ){
            maStr+=maCombinaison[i].getCouleur();       
    }
        maStr+="}";
        return maStr;
    }
}
