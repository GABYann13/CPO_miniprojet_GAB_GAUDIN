package premierprojettest;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
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

    
    
    
}
