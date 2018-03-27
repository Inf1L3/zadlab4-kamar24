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
public class Prostopadloscian {
   public double pow;
   public int a,b,c;
    public double v;  

    public Prostopadloscian(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public void Powierzchnia(){
        this.pow = 2*(a*b+a*c+b*c);
    }
    public void Objetosc(){
        this.v = a*b*c;
    }    
    public void WyswietlDane(){
        this.Powierzchnia();
        this.Objetosc();
        System.out.println("Prostopadłościan");
        System.out.println("Bok1: " + this.a);
        System.out.println("Bok2: " + this.b);
        System.out.println("Bok3: " + this.c);
        System.out.println("Powierzchnia: " + this.pow );
        System.out.println("Objętość: " + this.v );
    }  
}
