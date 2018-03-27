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
public class Stozek {
    public float pc;
    private float pb;
    private float pp;
    private float s;
    public float v;
    public int r;
    public int h;    

    public Stozek(int r, int h) {
        this.r = r;
        this.h = h;
    }
    
    public void objetosc(){
        this.v = (float)((Math.PI*(this.r*this.r)*this.h)/3);
    }
    public void powierzchnia(){
        this.s = (float) Math.sqrt((this.r*this.r)+(this.h*this.h));
        this.pb = (float) (Math.PI*this.r*this.s);
        this.pp = (float) (Math.PI*this.r*this.r);
        this.pc = (float) (this.pb+this.pp);
    }
    public void WyswietlDane(){
        this.objetosc();
        this.powierzchnia();
        System.out.println("Stożek");
        System.out.println("Promien: " + this.r);
        System.out.println("Wysokość: " + this.h );
        System.out.println("Tworząca: " + this.s);
        System.out.println("Objętość: " + this.v);
        System.out.println("Powierzchnia: " + this.v);
    }
    
}
