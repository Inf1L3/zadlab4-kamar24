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
public class Szescian {
    public int a;
    public double pow;
    public double v;

    public Szescian(int a) {
        this.a = a;
    }
    public void powierzchnia(){
        this.pow = Math.pow(a,2)*6;
    }
    public void objetosc(){
        this.v = Math.pow(a,3);
    }
    public void WyswietlDane(){
        this.powierzchnia();
        this.objetosc();
        System.out.println("Sześcian");
        System.out.println("Bok: " + this.a);
        System.out.println("Powierzchnia: " + this.pow );
        System.out.println("Objętość: " + this.v );
    }
    
}
