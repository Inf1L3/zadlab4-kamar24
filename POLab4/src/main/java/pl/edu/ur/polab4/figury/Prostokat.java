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
public class Prostokat {
    public int a;
    public int b;
    public int p;
    public int obw;

    public Prostokat(int a, int b) {
        this.a = a;
        this.b = b;
    }
    public void Pole(){
        this.p = this.a*this.b;
    }
    public void Obwod(){
        this.obw = (this.a*2)+(this.b*2);
    }
    public void WyswietlDane(){
        this.Pole();
        this.Obwod();
        System.out.println("Prostokąt");
        System.out.println("Bok1: " + this.a);
        System.out.println("Bok2: " + this.b);
        System.out.println("Pole: " + this.p );
        System.out.println("Obwód: " + this.obw );
    }
}
