/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp_bieres_batard;

/**
 *
 * @author Utilisateur
 */
public class TP_Bieres_BATARD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
BouteilleBiere uneBiere = new BouteilleBiere("Cuvée des trolls", (float) 7.0,"Dubuisson") ;

/**
uneBiere.nom = "Cuvée des trolls";
uneBiere.degreAlcool = (float) 7.0 ;
uneBiere.brasserie = "Dubuisson" ;
uneBiere.ouverte = false ;
*

BouteilleBiere autreBiere = new BouteilleBiere("Leffe", (float) 6.6,"Abbaye de Leffe") ;


autreBiere.nom = "Leffe";
autreBiere.degreAlcool = (float) 6.6 ;
autreBiere.brasserie = "Abbaye de Leffe" ;
autreBiere.ouverte = false ;
*/

BouteilleBiere premiereBiere = new BouteilleBiere ("heineken", (float) 5,"Heineken France") ;
BouteilleBiere secondeBiere = new BouteilleBiere ("chouffe", (float) 7.5,"victoria") ;
BouteilleBiere troisiemeBiere = new BouteilleBiere ("rince cochon", (float) 7.2,"intermarche") ;

premiereBiere.lireEtiquette();
secondeBiere.lireEtiquette();
troisiemeBiere.lireEtiquette();

    }
    
}
