package premierprojettest;

import java.awt.Color;
import javax.swing.JButton;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author yann
 */
public class Pion {
    int x;
    int y;
          
    private String couleur;
    
    public Pion(String couleur){
        this.couleur = couleur;
    } 

    public String getCouleur() {
        return couleur;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    @Override
    public String toString() {
        if (couleur != null && !couleur.isEmpty()) {
            
            return String.valueOf(couleur.charAt(0));
        }
        return ""; 
    }

    public int getValeur(){
       int Valeur;
       if (x<110){
         Valeur = 1;  
       }
       else if (x<220){
         Valeur = 2;  
       }
       else if (x<330){
         Valeur = 3;  
       }
       else if (x<440){
         Valeur = 4;  
       }
       else if (x<550){
         Valeur = 5;  
       }
       else if (x<660){
         Valeur = 6;  
       }
       else if (x<770){
         Valeur = 7;  
       }
       
       else {  
           Valeur = 8;
       }
        
       return Valeur;
    }
    
    
}
