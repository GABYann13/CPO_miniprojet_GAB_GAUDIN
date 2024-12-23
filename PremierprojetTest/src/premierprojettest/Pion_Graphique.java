package premierprojettest;



/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author yann
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Pion_Graphique extends JButton implements ActionListener {
    private Color[] couleurs;
    private int indexCouleur = 0;
    private Boolean cliquable = true;

    public Pion_Graphique(Color[] couleurs) {
        this.couleurs = couleurs;
        setBackground(couleurs[indexCouleur]);
        addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(cliquable){
            indexCouleur = (indexCouleur + 1) % couleurs.length;
            setBackground(couleurs[indexCouleur]);
        }
        
    }

    public Color getCurrentColor() {
        return couleurs[indexCouleur];
    }

    public void setColors(Color[] newColors) {
        this.couleurs = newColors;
        indexCouleur = 0;
        setBackground(couleurs[indexCouleur]);
    }
    
    // renvoie le charactere correspondat à la couleur
    public Character getCharColor(){
        Character resultat = 'A';
        switch (indexCouleur) {
            case 0:  resultat = 'A';
                     break;
            case 1:  resultat = 'R';
                     break;
            case 2:  resultat = 'B';
                     break;
            case 3:  resultat = 'G';
                     break;
            case 4:  resultat = 'Y';
                     break;
            case 5:  resultat = 'O';
                     break;
            case 6:  resultat = 'M';
                     break;
            case 7:  resultat = 'W';
                     break;   
            case 8:  resultat = 'P';
                     break;
        }
        return resultat;
    }
    
    public void setCliquable(){
        if(cliquable){
            cliquable = false;
           
        }
        else {
            cliquable = true;
        }
    }
    public Boolean getCliquable(){
        return this.cliquable;
    }
}
    

    

