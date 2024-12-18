    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package premierprojettest;
import java.util.ArrayList;


/**
 *
 * @author yann
 */
public class PremierprojetTest {
public static void main(String[] args) {
        Pion pion1 = new Pion('R');
        Pion pion2 = new Pion('Y');
        Pion pion3 = new Pion('M');
        Pion pion4 = new Pion('O');
        Pion pion5 = new Pion('B');
        Pion pion6 = new Pion('G');
        Pion pion7 = new Pion('P');
        Pion pion8 = new Pion('W');
              
        ArrayList<Character> couleursDisponibles = new ArrayList<Character>();
        couleursDisponibles.add('R');
        couleursDisponibles.add('Y');
        couleursDisponibles.add('M');
        couleursDisponibles.add('O');
        couleursDisponibles.add('B');
        //couleursDisponibles.add('G');
        //couleursDisponibles.add('P');
        //couleursDisponibles.add('W');
                              
        /*System.out.println("Pion Red : " + pion1);  
        System.out.println("Pion Blue : " + pion5);    
        System.out.println("Pion Magenta : " + pion3);
        System.out.println("Pion Yellow : " + pion2);
        System.out.println("Pion Green : " + pion6);
        System.out.println("Pion Pink : " + pion7);
        System.out.println("Pion Orange : " + pion4);
        System.out.println("Pion White : " + pion8);*/
        
        Character[] combinaisonDuMaitre = new Character[4];     // combi du maitre aléatoire
        int [] couleurs_indice = new int[2];                    // resultat des comparaisons
        
        // creation de la combinaison du joueur (statique)
        Pion [] tableauDePion = {pion1, pion2, pion3, pion4};
        Combinaison maCombinaison = new Combinaison(tableauDePion);
        System.out.println(maCombinaison.toString());
        
        // Creation de la combinaison du maitre (Aléatoire)
        combinaisonDuMaitre = maCombinaison.genererAleatoire(4, couleursDisponibles);          
        System.out.println("Combinaison du maitre : " + combinaisonDuMaitre[0] + combinaisonDuMaitre[1] + combinaisonDuMaitre[2] + combinaisonDuMaitre[3]);
        
        // Nouvelle combinaison : BYMO
        Pion [] tableauDePionA = {pion5, pion2, pion3, pion4};
        Combinaison newCombinaisonA = new Combinaison(tableauDePionA);
        System.out.println(newCombinaisonA.toString());
        
        // Comparaison des combinaisons BYMO avec celle du maitre
        couleurs_indice = maCombinaison.comparer(newCombinaisonA, combinaisonDuMaitre);
        System.out.println("Nb pions Noirs : " + couleurs_indice[0] + "; Nb pions Blancs : " + couleurs_indice[1]);
        
        // Test plateau de jeu
        // Creation Plateau, combi secrete : OMYR
        Pion [] tableauDePionB = {pion4, pion3, pion2, pion1};
        Combinaison secret = new Combinaison(tableauDePionB);
        PlateauDeJeu monPlateauDeJeu = new PlateauDeJeu(secret, 3);
        System.out.println("combi secrete du Plateau : " + secret.toString());
        // Tentative 1 BYMR
        Pion [] tableauDePionC = {pion5, pion2, pion3, pion1};
        Combinaison tentative_1 = new Combinaison(tableauDePionC);
        System.out.println("combi tentative 1 : " + tentative_1.toString());
        monPlateauDeJeu.proposerCombinaison(tentative_1);
        monPlateauDeJeu.afficherPlateau();
        // Tentative 2 BYOM
        Pion [] tableauDePionD = {pion5, pion2, pion4, pion3};
        Combinaison tentative_2 = new Combinaison(tableauDePionD);
        System.out.println("combi tentative 2 : " + tentative_2.toString());
        monPlateauDeJeu.proposerCombinaison(tentative_2);
        monPlateauDeJeu.afficherPlateau();
        monPlateauDeJeu.estVictoire();
        monPlateauDeJeu.gameOver();
        // Tentative 3 MROY
        Pion [] tableauDePionE = {pion3, pion1, pion4, pion2};
        Combinaison tentative_3 = new Combinaison(tableauDePionE);
        System.out.println("combi tentative 3 : " + tentative_3.toString());
        monPlateauDeJeu.proposerCombinaison(tentative_3);
        monPlateauDeJeu.afficherPlateau();
        monPlateauDeJeu.estVictoire();
        monPlateauDeJeu.gameOver();
        // Tentative 4 OMYR
        Pion [] tableauDePionF = {pion4, pion3, pion2, pion1};
        Combinaison tentative_4 = new Combinaison(tableauDePionF);
        System.out.println("combi tentative 4 : " + tentative_4.toString());
        monPlateauDeJeu.proposerCombinaison(tentative_4);
        monPlateauDeJeu.afficherPlateau();
        monPlateauDeJeu.estVictoire();
        monPlateauDeJeu.gameOver();
    }
}
