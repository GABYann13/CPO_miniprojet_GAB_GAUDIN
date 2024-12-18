
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
    int taille=4;           // parametre par defaut
    Pion [] maCombinaison = new Pion [taille];
    
    // Constructeur
    public Combinaison(Pion[] elements){
        maCombinaison=elements;    
    } 
    
    // Retourne la couleur d'un pion dont on indique la position en parametre
    public Character getCouleur(int nPion){
        return maCombinaison[nPion].getCouleur();
    }
    
    // génère une combinaison aléatoire de taille spécifiée, en sélec6onnant des couleurs aléatoires parmi couleursDisponibles
    public Character[] genererAleatoire(int laTaille, ArrayList<Character> couleursDisponibles) {
       Character[] combinaisonDuMaitre = new Character[laTaille];
       int nombreCouleursDispo = couleursDisponibles.size();
       Random NbrRandom = new Random();     
       int NbrAleatoire;
       
       for(int i=0 ; i<laTaille ; i++){
            NbrAleatoire = NbrRandom.nextInt(nombreCouleursDispo); 
            combinaisonDuMaitre[i] = couleursDisponibles.get(NbrAleatoire);       
        }
    return combinaisonDuMaitre; 
    }
          
    // on va retourner un nombre de pions Noirs (les biens placés) et un nombre de pions Blancs (les mal placés)
    public int[] comparer(Combinaison autre, Character[]combinaisonDuMaitre) {
        int pionNoir=0;                                 // Nb de bien placé
        int pionBlanc=0;                                // Nb de pions présents mais mal placés
        Boolean isPionNoir=false, isPionBlanc=false;    // utilisation de flags (Mon père m'a expliqué cette ruse)
        int [] couleurs_indice = new int[2];            // resultat
        
        for (int i=0 ; i<taille ; i++){                 // j'itere sur la nouvelle combi 
            for (int j=0 ; j<taille ; j++){             // j'itere sur la combinaison maitre
                if (autre.maCombinaison[i].getCouleur()==combinaisonDuMaitre[j]){ //compare la couleur de maCombinaison avec chaque couleurs de la combinaison du maitre
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

    // methode comparer qui prend en parametre deux combinaisons et retourne un nombre de pions Noirs et un nombre de pions Blancs 
    public int[] comparer(Combinaison autre, Combinaison combinaisonDuMaitre) {
        Character[] combi= new Character[taille];
        // je mets la combinaison dans un tableau de Character
        for (int i=0; i<taille; i++){
            combi[i]= combinaisonDuMaitre.getCouleur(i);
        }
        return comparer(autre, combi);
    }
    
    // Attention la methode suivante est implémentée pour une taille =4
    @Override
    public String toString() {
        return "Combinaison{" + maCombinaison[0] + maCombinaison[1] + maCombinaison[2] + maCombinaison[3] + '}';
    }
}
