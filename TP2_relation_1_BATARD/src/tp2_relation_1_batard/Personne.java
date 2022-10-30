/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_relation_1_batard;

/**
 *
 * @author Utilisateur
 */
public class Personne {/** creation de la classe Personne et des attribut grace a la methode ToString*/


    public String prenom;
    public String nom;
    public int nbVoitures;
    public Voiture[] liste_voitures;  

/**int nbVoitures ;
Voiture [] liste_voitures ;
*/
public Personne(String unPrenom, String unNom){/** creatio constructeur personne*/
        prenom = unPrenom;
        nom = unNom;
        nbVoitures = 0; //Initialisation du nombre de voitures possedes à 0
        liste_voitures = new Voiture[3]; 
liste_voitures = new Voiture [3] ;/** on reserve la memoire du tableau*/
}
 @Override
        public String toString(){
            String P; 
            P = prenom + " " + nom + " " + nbVoitures;
            return P;
        }
   
    public boolean ajouter_voiture(Voiture voiture_a_ajouter) {/** ajout de la methode*/
     if (nbVoitures == 3){/**si le proprietaire a deja trois voitures*/
         System.out.println("Nombre de voitures maximum atteint");
         return false;
     }
     if (voiture_a_ajouter.proprietaire != null){ //si la voiture a ajouter possede deja un proprietaire*/         
         System.out.println("Cette voiture a déjà un propriétaire");
         return false;
     } /** si nb voiture est inferieur a trois*/
     liste_voitures[nbVoitures] = voiture_a_ajouter; //On rajoute la voiture dans la case qui correspond au nbVoitures que le propriétaire possède
     nbVoitures ++; //on ajoute 1 à nbVoitures)
     voiture_a_ajouter.proprietaire = this ;/** permet d'executer la methode*/
     return true;
}

}
