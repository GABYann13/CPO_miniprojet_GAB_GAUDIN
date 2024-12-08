package premierprojettest;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author yann
 */
public class Pion {
    private Character maCouleur;
    
    public Pion(Character couleur){
        this.maCouleur = couleur;
    } 

    public Character getCouleur() {
        return maCouleur;
    }

    public void setCouleur(Character couleur) {
        this.maCouleur = couleur;
    }

    @Override
    public String toString() {
        return "Pion{" + "couleur=" + maCouleur + '}';
    }
    
    
}
