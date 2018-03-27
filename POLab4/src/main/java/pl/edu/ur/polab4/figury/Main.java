/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.polab4.figury;
/**
 *
 * @author Lukasz
 */
public class Main {
    
    public static void main(String[] args) {
        Kwadrat Kwadrat1 = new Kwadrat(2);
        Kwadrat1.WyswietlDane();
        
        Prostokat Prostokat = new Prostokat(3,5);
        Prostokat.WyswietlDane();
        
        Kolo Kolo1 = new Kolo(4);
        Kolo1.WyswietlDane();
        
        Kula Kula1 = new Kula(3);
        Kula1.WyswietlDane();
        
        Stozek Stozek1 = new Stozek(2,4);
        Stozek1.WyswietlDane();
        
        Szescian Szescian1 = new Szescian(4);
        Szescian1.WyswietlDane();
        
        Prostopadloscian Prostop = new Prostopadloscian(2,3,4);
        Prostop.WyswietlDane();
    }
}