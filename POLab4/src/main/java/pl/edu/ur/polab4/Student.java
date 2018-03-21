/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.polab4;

/**
 *
 * @author Lukasz Kusta
 */
public class Student {
     
    String imie;  
    String nazwisko;
    int numer_indeksu;
    String nazwa_specjalnosci;
    int rok_studiow;
 
    public Student(String imie, String nazwisko, int numer_indeksu, String nazwa_specjalnosci, int rok_studiow){ // konstruktor I
    this.imie = imie;
    this.nazwisko = nazwisko;
    this.numer_indeksu = numer_indeksu;
    this.nazwa_specjalnosci= nazwa_specjalnosci;
    this.rok_studiow = rok_studiow;
    }
 
    public Student(String imie, String nazwisko){ // konstruktor II
    this.imie = imie;
    this.nazwisko = nazwisko;
 
    }
 
    public Student(int numer_indeksu){     // konstruktor III
    this.numer_indeksu = numer_indeksu;
    } 
    public Student(String imie, String nazwisko, String nazwa_specjalnosc){  // konstruktor IV
    this.imie= imie;
    this.nazwa_specjalnosci = nazwa_specjalnosc;
    this.nazwisko = nazwisko;
    }
 
    public void PokazDane(){
 
        System.out.println("Imie: "+this.imie);
        System.out.println("Nazwisko: "+this.nazwisko);
        System.out.println("Numer indeksu: "+this.numer_indeksu);
        System.out.println("Nazwa specjalnosci : "+this.nazwa_specjalnosci);
        System.out.println("Rok studiow : "+this.rok_studiow);
    }
}

