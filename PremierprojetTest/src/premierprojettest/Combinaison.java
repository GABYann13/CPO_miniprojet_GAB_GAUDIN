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
           int NbrAleatoire = NbrRandom.nextInt(taille1);
        Random NbrRandom = new Random(); 
        CombinaisonDuMaitre[i]= NbrAleatoire;
       
    }
        
    
    return CombinaisonDuMaitre; 
    }
    public comparer(Combinaison autre){
        
    }
    toString(){
        
    }
}
