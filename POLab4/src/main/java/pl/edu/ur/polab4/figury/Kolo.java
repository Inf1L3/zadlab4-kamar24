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
public class Kolo {
    public int r;
    public float obw;
    public float p;

    public Kolo(int r) {
        this.r = r;
    }      
    public void Obwod(){
        this.obw = (float) (2*Math.PI*this.r);
    }
    public void Pole(){
        this.p = (float) (Math.PI*(this.r*this.r));
    }
    public void WyswietlDane(){
        this.Pole();
        this.Obwod();
        System.out.println("Kolo");
        System.out.println("Pole: " + this.p );
        System.out.println("Obwód: " + this.obw );
    }
}
