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
        couleursDisponibles.add('G');
        couleursDisponibles.add('P');
        couleursDisponibles.add('W');

        
        int [] couleurs_indice = new int[2];                    // resultat des comparaisons
        
        // TEST de la creation de la combinaison du joueur (statique)
        Pion [] tableauDePion = {pion1, pion2, pion3, pion4};
        Combinaison maCombinaison = new Combinaison(tableauDePion);
        System.out.println(maCombinaison.toString());
        
        // Creation de la combinaison du maitre (Aléatoire)
        Combinaison combinaisonDuMaitre=new Combinaison();
        combinaisonDuMaitre.genererAleatoire(4, couleursDisponibles);          
        System.out.println("Combinaison du maitre : " + combinaisonDuMaitre.toString());
        
        // Nouvelle combinaison : BYMO
        Pion [] tableauDePionA = {pion5, pion2, pion3, pion4};
        Combinaison newCombinaisonA = new Combinaison(tableauDePionA);
        System.out.println(newCombinaisonA.toString());
        
        // Comparaison des combinaisons BYMO avec celle du maitre
        couleurs_indice = combinaisonDuMaitre.comparer(newCombinaisonA);
        System.out.println("Nb pions Noirs : " + couleurs_indice[0] + "; Nb pions Blancs : " + couleurs_indice[1]);
                       
        // TEST Partie
        Partie maPartie;
        maPartie = new Partie(4,6,couleursDisponibles);
        maPartie.lancerPartie();
        maPartie.afficherRegles();
        maPartie.terminerPartie();
    }
}
