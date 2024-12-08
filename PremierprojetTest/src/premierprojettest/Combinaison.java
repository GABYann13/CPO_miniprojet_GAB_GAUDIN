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
    Pion [] maCombinaison1 = new Pion [4];
    public Combinaison(Pion[] elements){
    maCombinaison1=elements;    
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
    
    public Character[] comparer(Combinaison autre, Character[]CombinaisonDuMaitre) {
        Character[] Tentative = new Character[taille];
        Character[] Couleurs_indice = new Character[taille];
        for (int i=0 ; i<taille ; i++){
            if (Tentative[i]==CombinaisonDuMaitre[i]){
                Couleurs_indice[i]= 1;
            }
            else{
                Couleurs_indice[i]= 2;
            }
        }
        

     return Couleurs_indice;   
    }

    @Override
    public String toString() {
        return "Combinaison{" + "combinaison=" + maCombinaison1[0] + maCombinaison1[1] + maCombinaison1[2] + maCombinaison1[3] + '}';
    }
    
        
    
}
