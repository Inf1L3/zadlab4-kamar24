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
public class Kula {
    public int r;
    public float v;
    public float pow;

    public Kula(int r) {
        this.r = r;
    }    
    public void objetosc(){
        this.v = (float) ((4/3)*(Math.PI*Math.pow(this.r,3)));
    }
    public void powierzchnia(){
        this.pow = (float) (4*Math.PI*Math.pow(this.r,2));
    }
    public void WyswietlDane(){
        this.objetosc();
        this.powierzchnia();
        System.out.println("Kula");
        System.out.println("Promień: " + this.r);
        System.out.println("Powierzchnia kuli: " + this.pow );
        System.out.println("Objętość kuli: " + this.v );
    }
}
