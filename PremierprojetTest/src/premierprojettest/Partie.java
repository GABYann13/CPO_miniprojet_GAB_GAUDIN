/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package premierprojettest;

import java.util.ArrayList;

/**
 *
 * @author kango
 */
public class Partie {
    PlateauDeJeu plateau;
    String lesRegles = "Le jeu se joue a deux : un codificateur et un decodeur...";    
    
    // Constructeur
    public Partie(int tailleCombinaison, int nbToursMax, ArrayList<Character> couleursDisponibles){
        Combinaison combinaisonDuMaitre=new Combinaison();
        combinaisonDuMaitre.genererAleatoire(tailleCombinaison, couleursDisponibles);
        plateau = new PlateauDeJeu(combinaisonDuMaitre, nbToursMax);
        // pour Debug :
        System.out.println("combi secrete du Plateau : " + combinaisonDuMaitre.toString());
    }
    
    public void lancerPartie(){
                
       /* // En attendant l'interaction graphique : Test plateau de jeu. A virer lors de l'integration au graphique
        Pion pion1 = new Pion('R');
        Pion pion2 = new Pion('Y');
        Pion pion3 = new Pion('M');
        Pion pion4 = new Pion('O');
        Pion pion5 = new Pion('B');
        Pion pion6 = new Pion('G');
        Pion pion7 = new Pion('P');
        Pion pion8 = new Pion('W');
        // Tentative 1 BYMR
        Pion [] tableauDePionC = {pion5, pion2, pion3, pion1};
        Combinaison tentative_1 = new Combinaison(tableauDePionC);
        System.out.println("combi tentative 1 : " + tentative_1.toString());
        plateau.proposerCombinaison(tentative_1);
        plateau.afficherPlateau();
        // Tentative 2 BYOM
        Pion [] tableauDePionD = {pion5, pion2, pion4, pion3};
        Combinaison tentative_2 = new Combinaison(tableauDePionD);
        System.out.println("combi tentative 2 : " + tentative_2.toString());
        plateau.proposerCombinaison(tentative_2);
        plateau.afficherPlateau();
        plateau.estVictoire();
        plateau.gameOver();
        // Tentative 3 MROY
        Pion [] tableauDePionE = {pion3, pion1, pion4, pion2};
        Combinaison tentative_3 = new Combinaison(tableauDePionE);
        System.out.println("combi tentative 3 : " + tentative_3.toString());
        plateau.proposerCombinaison(tentative_3);
        plateau.afficherPlateau();
        plateau.estVictoire();
        plateau.gameOver();
        // Tentative 4 OMYR
        Pion [] tableauDePionF = {pion4, pion3, pion2, pion1};
        Combinaison tentative_4 = new Combinaison(tableauDePionF);
        System.out.println("combi tentative 4 : " + tentative_4.toString());
        plateau.proposerCombinaison(tentative_4);
        plateau.afficherPlateau();
        plateau.estVictoire();
        plateau.gameOver();
*/
    }
    
    public void afficherRegles(){
        System.out.println(lesRegles);
    }
    
    public void terminerPartie(){
         plateau.estVictoire();
         plateau.gameOver();
    }
   
}
    
    
    
    
    
    

