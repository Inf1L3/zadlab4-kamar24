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
public class Kwadrat {
    public int a;
    public int p;
    public int obw;

    public Kwadrat(int a) {
        this.a = a;
    }
    public void Pole(){
        this.p = this.a*this.a;
    }
    public void Obwod(){
        this.obw = this.a*4;
    }
    public void WyswietlDane(){
        this.Pole();
        this.Obwod();
        System.out.println("Kwadrat");
        System.out.println("Bok: " + this.a);
        System.out.println("Pole: " + this.p );
        System.out.println("Obwód: " + this.obw );
    }
}
