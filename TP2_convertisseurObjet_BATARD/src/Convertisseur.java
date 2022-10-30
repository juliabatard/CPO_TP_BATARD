/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Utilisateur
 */
public class Convertisseur {
public int nbConversions;

public Convertisseur () {
    nbConversions = 0;
}
public double CelciusVersKelvin ( double tempcelcius){
    double tempkelvin = 273.15 + tempcelcius;
    nbConversions +=1;
    return tempkelvin;
}

public double KelvinVersCelcius ( double tempkelvin){
    double tempcelcius = tempkelvin - 273.15;
    nbConversions +=1;
    return tempcelcius;
    
}
    
public double FarenheitVersCelcius ( double tempfarenheit){
    double tempcelcius = (tempfarenheit - 32)/1.8;
    nbConversions +=1;
    return tempcelcius;
}    

public double CelciusVersFarenheit (double tempcelcius){
    double tempfarenheit = (tempcelcius + 32)*1.8;
    nbConversions +=1;
    return tempfarenheit;
}

public double FarenheitVersKelvin (double tempfarenheit){
    double tempkelvin = (tempfarenheit - 32) / 1.8 + 273.14;;
    nbConversions +=1;
    return tempkelvin;
}

public double KelvinVersFarenheit ( double tempkelvin ){
    double tempfarenheit = (tempkelvin - 273.14) * 1.8 + 32;
    nbConversions +=1;
        return tempfarenheit;
}
@Override
public String toString () {
 return "nb de conversions"+ nbConversions;
}

}


/**
BouteilleBiere uneBiere = new BouteilleBiere("Cuvée des trolls", (float) 7.0,"Dubuisson") ;
*/