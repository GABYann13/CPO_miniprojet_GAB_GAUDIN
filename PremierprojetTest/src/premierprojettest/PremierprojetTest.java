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
        System.out.println( pion1.getCouleur());
        
        Pion [] tableauDePion = {pion1, pion2, pion3, pion4};
        Combinaison maCombinaison = new Combinaison(tableauDePion);
        System.out.println(maCombinaison.toString());
        
        //PlateauDeJeu monPlateauDeJeu = new PlateauDeJeu();
        
    }
    
}
