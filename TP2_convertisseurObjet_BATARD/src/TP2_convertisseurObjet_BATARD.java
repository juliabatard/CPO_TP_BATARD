

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.util.Scanner;

/**
 *
 * @author Utilisateur
 */
public class TP2_convertisseurObjet_BATARD {

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) {
        // TODO code application logic here
        
    Convertisseur conversion1 = new Convertisseur();
    Convertisseur conversion2 = new Convertisseur();
    
    int nb;
    Scanner sc = new Scanner(System.in);
    /**
     * 
    System.out.println("\nEntrer un nombre :");
    nb = sc.nextInt();
   
    conversion1.CelsiusVersKelvin(10.0);
    conversion1.KelvinVersFarenheit(13.0);
    conversion2.FarenheitVersCelsius(25.0);
    System.out.println( "Le nombre de conversions pour le premier objet est " + conversion1.nbConversions + " et du second objet est " + conversion2.nbConversions + "");
   */
    System.out.println("\nQuelle conversion souhaitez-vous faire ?:");
    System.out.println("1)CelsiusVersKelvin");
    System.out.println("2)KelvinVersCelsius");
    System.out.println("3)FarenheitVersCelsius");
    System.out.println("4)CelsiusVersFarenheit");
    System.out.println("5)FarenheitVersKelvin");
    System.out.println("6)KelvinVersFarenheit");
    nb = sc.nextInt();
   
while (nb < 1 || nb > 6){
    System.out.println("Erreur: Saisir une commande entre 1 et 6");
        System.out.println("\nQuelle conversion souhaitez-vous faire ?:");
        nb = sc.nextInt();
           
            }
System.out.println("Quelle temperature a convertir ?");
double T = sc.nextDouble();
switch(nb){
   
       case 1:
           System.out.println("Température en Kelvin: " + conversion1.CelsiusVersKelvin(T));
           break;
   
       case 2:
           System.out.println("Temperature en Celsius: " + conversion1.KelvinVersCelsius(T));
           break;
   
       case 3:
           System.out.println("Temperature en Celsius: " + conversion1.FarenheitVersCelsius(T));
           break;
       
       case 4:
           System.out.println("Température en Farenheit: " + conversion1.CelsiusVersFarenheit(T));
           break;
   
       case 5:
           System.out.println("Temperature en Kelvin: " + conversion1.FarenheitVersKelvin(T));
           break;
   
       case 6:
           System.out.println("Temperature en Farenheit: " + conversion1.KelvinVersFarenheit(T));
           break;
       
   }
     
       
    
    
    
    
    
    }
    
}
