    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package premierprojettest;
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
        Pion pion2 = new Pion('J');
        Pion pion3 = new Pion('V');
        Pion pion4 = new Pion('O');
        Pion pion5 = new Pion('B');
        Pion pion6 = new Pion('K');
        Pion pion7 = new Pion('S');
        Pion pion8 = new Pion('M');
        System.out.println( pion1.getCouleur());
        
        /*System.out.println("Pion Rouge : " + pion1);  
        System.out.println("Pion Bleu : " + pion5);    
        System.out.println("Pion Violet : " + pion3);
        System.out.println("Pion Jaune : " + pion2);
        System.out.println("Pion Kaki : " + pion6);
        System.out.println("Pion Saumon : " + pion7);
        System.out.println("Pion Orange : " + pion4);
        System.out.println("Pion Marron : " + pion8);*/
        
        Pion [] tableauDePion = {pion1, pion2, pion3, pion4};
        Combinaison maCombinaison = new Combinaison(tableauDePion);
        System.out.println(maCombinaison.toString());
        
        
        
        //PlateauDeJeu monPlateauDeJeu = new PlateauDeJeu();
        
    }
    
}
