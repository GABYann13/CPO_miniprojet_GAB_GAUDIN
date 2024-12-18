/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package premierprojettest;

import java.util.ArrayList;
import premierprojettest.Combinaison;
//import PlateauDeJeu;
/**
 *
 * @author kango
 */
public class Partie {
    PlateauDeJeu plateau;
    ArrayList <Character> couleursDisponibles; //liste de toutes les couleures dispo
    //PlateauDeJeu plateau; //permet de gérer les tentatives de reponses
    
    
    public Partie(PlateauDeJeu plateau, ArrayList <Character> couleursDisponibles, int taille) {
        for(int i=0; i<taille; i++){
            System.out.println();
        }
    }
}
    
    
    
    
    
    

