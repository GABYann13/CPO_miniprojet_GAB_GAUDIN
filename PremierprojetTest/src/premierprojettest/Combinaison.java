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
    Pion[] element;
    int taille;
    Pion [] combinaison = new Pion [4];
    public Combinaison(Pion[] elements){
        
    }
    public Character[] genererAleatoire(int taille, ArrayList<Character> couleursDisponibles) {
       Character[] CombinaisonDuMaitre = new Character[taille];
       int taille1 = couleursDisponibles.size();
       for(int i=0 ; i<taille ; i++){
           Random NbrRandom = new Random();
           int NbrAleatoire = NbrRandom.nextInt(taille1); 
        CombinaisonDuMaitre[i] = couleursDisponibles.get(NbrAleatoire);
       
    }
    return CombinaisonDuMaitre; 
    }
    
    public int comparer(Combinaison autre){
        Character[] Tentative = new Character[taille];
        Character[] Couleurs_rep = new Character[taille];
        for (int i=0 ; i<taille ; i++){
            if (Tentative[i]==CombinaisonDuMaitre[i]){
                Couleur_rep[i]=blanc;
            }
            else{
                Couleur_rep[i]=noir;
            }
        }
        

     return int;   
    }
    toString(){
        
    }
}
