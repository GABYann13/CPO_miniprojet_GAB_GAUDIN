    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package premierprojettest;
import java.util.ArrayList;
import premierprojettest.Combinaison;
//import premierprojettest.PlateauDeJeu;
import premierprojettest.Pion;


/**
 *
 * @author yann
 */
public class PremierprojetTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pion pion1 = new Pion('R');
        Pion pion2 = new Pion('Y');
        Pion pion3 = new Pion('M');
        Pion pion4 = new Pion('O');
        Pion pion5 = new Pion('B');
        Pion pion6 = new Pion('G');
        Pion pion7 = new Pion('P');
        Pion pion8 = new Pion('W');
        System.out.println( pion1.getCouleur());
        
        ArrayList<Character> couleursDisponibles = new ArrayList<Character>();
        couleursDisponibles.add('R');
        couleursDisponibles.add('Y');
        couleursDisponibles.add('M');
        couleursDisponibles.add('O');
        couleursDisponibles.add('B');
        couleursDisponibles.add('G');
        couleursDisponibles.add('P');
        couleursDisponibles.add('W');
        
        
        /*System.out.println("Pion Red : " + pion1);  
        System.out.println("Pion Blue : " + pion5);    
        System.out.println("Pion Magenta : " + pion3);
        System.out.println("Pion Yellow : " + pion2);
        System.out.println("Pion Green : " + pion6);
        System.out.println("Pion Pink : " + pion7);
        System.out.println("Pion Orange : " + pion4);
        System.out.println("Pion White : " + pion8);*/
        
        Pion [] tableauDePion = {pion1, pion2, pion3, pion4};
        Combinaison maCombinaison = new Combinaison(tableauDePion);
        System.out.println(maCombinaison.toString());
        Combinaison CombinaisonDuMaitre = new Combinaison(tableauDePion);
        System.out.println(CombinaisonDuMaitre);
        
        
        
        //PlateauDeJeu monPlateauDeJeu = new PlateauDeJeu();
        
    }
    
}
