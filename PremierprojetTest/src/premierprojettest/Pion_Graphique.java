package premierprojettest;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author yann
 */
public class Pion_Graphique {
    Pion pion_associe
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        Graphics2D g2d = (Graphics2D) g;
        Color couleur;
        switch (Pion_associe.getValeur()){
            case 1 -> 
                couleur = Color.RED;
            case 2 -> 
                couleur = Color.BLUE;
            case 3 -> 
                couleur = Color.MAGENTA;
            case 4 -> 
                couleur = Color.YELLOW;
            case 5 -> 
                couleur = Color.GREEN;
            case 6 -> 
                couleur = Color.PINK;
            case 7 -> 
                couleur = Color.ORANGE;
            case 8 -> 
                couleur = Color.WHITE;
            
             
    }
    
    }
}
