/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.polab4.studenci;

import java.util.Scanner;

/**
 *
 * @author Lukasz
 */
public class Baza {
    Student tab1[] = new Student[5];
    
    public void wypelnienie(){
       for(int i = 0;i<5;i++){
            Student student1 = new Student("", "", 0, "", 0);
            tab1[i] = student1;
        } 
    }
    
    public void menu(){
        Scanner in = new Scanner(System.in);
        int menu = 1;
        
        while (menu !=0){
            System.out.println("1. Wprowadz dane ");
            System.out.println("2. Edycja danych ");
            System.out.println("3. Usunięcie danych ");
            System.out.println("4. Wyświetlenie  jednego studenta");
            System.out.println("5. Wyświetlenie  wszystkich studentów");
            System.out.println("6. Wyświetlene  kilku studentów");
            System.out.println("0. Koniec");
            menu = in.nextInt();
            
            switch(menu){
                case 1: wprowadzanie();
                    break;
                case 2: edytowanie();
                    break;
                case 3: usuwanie();
                    break;
                case 4: wyswietl1();
                    break;
                case 5: wyswietlAll();
                    break;
                case 6: wyswietlZakres();
                    break; 
                case 0: break;
            }
        }
    }
    private void wprowadzanie(){
        Scanner inImie = new Scanner(System.in);
        Scanner inNazwisko = new Scanner(System.in);
        Scanner inSpecjalnosc = new Scanner(System.in);
        Scanner in = new Scanner(System.in);
        
        System.out.println("Chcesz wprowadzić dane");
        System.out.println("Podaj inkeds pod którym chcesz wprowadzić dane");
        int id = in.nextInt();        
        
        System.out.println("Podaj imię: ");
        tab1[id].setImie(inImie.nextLine());
        System.out.println("Podaj nazwisko: ");
        tab1[id].setNazwisko(inNazwisko.nextLine());
        System.out.println("Podaj Numer Indeksu: ");  
        tab1[id].setNr_indeksu(in.nextInt());
        System.out.println("Podaj Nazwe specjalności: "); 
        tab1[id].setNazwaSpecjalnosci(inSpecjalnosc.nextLine());
        System.out.println("Podaj Rok studiów"); 
        tab1[id].setRok_studiow(in.nextInt());        
    }
    private void edytowanie(){
        Scanner inImie = new Scanner(System.in);
        Scanner inNazwisko = new Scanner(System.in);
        Scanner inSpecjalnosc = new Scanner(System.in);
        Scanner in = new Scanner(System.in);
        
        System.out.println("Chcesz zmienić dane");
        System.out.println("Podaj indeks pod którym chcesz zmienić dane");
        int id = in.nextInt();
        
        System.out.println("Podaj zmienone imię: ");
        tab1[id].setImie(inImie.nextLine());
        System.out.println("Podaj zmienione nazwisko: ");
        tab1[id].setNazwisko(inNazwisko.nextLine());
        System.out.println("Podaj zmieniony Numer Indeksu: ");  
        tab1[id].setNr_indeksu(in.nextInt());
        System.out.println("Podaj zmienioną Nazwe specjalności: "); 
        tab1[id].setNazwaSpecjalnosci(inSpecjalnosc.nextLine());
        System.out.println("Podaj zmieniony Rok studiów"); 
        tab1[id].setRok_studiow(in.nextInt());
        
    }
    private void usuwanie(){
        Scanner in = new Scanner(System.in);
        
        System.out.println("Chcesz usunąć dane");
        System.out.println("Podaj indeks pod którym chcesz usunąć dane");
        int id = in.nextInt();
        
        tab1[id].setImie("");
        tab1[id].setNazwisko("");
        tab1[id].setNr_indeksu(0);
        tab1[id].setNazwaSpecjalnosci("");
        tab1[id].setRok_studiow(0);
    }
    private void wyswietl1(){
        Scanner in = new Scanner(System.in);
        
        System.out.println("Chcesz wyświetlić dane jednego studenta");
        System.out.println("Podaj indeks który chcesz wyświetlić: ");
        int id = in.nextInt();
        
        System.out.println("Wybrane ID: " + id);
        System.out.println("Imie: " + tab1[id].getImie());
        System.out.println("Nazwisko: " + tab1[id].getNazwisko());
        System.out.println("Nr indeksu: " + tab1[id].getNr_indeksu());
        System.out.println("Nazwa specjalnosci: " + tab1[id].getNazwaSpecjalnosci());
        System.out.println("Rok studiow: " + tab1[id].getRok_studiow());
    }
    private void wyswietlAll(){
        for(int i = 0; i < 5; i++){
            System.out.println("Index: " + i);
            System.out.println("Imie: " + tab1[i].getImie());
            System.out.println("Nazwisko: " + tab1[i].getNazwisko());
            System.out.println("Nr indeksu: " + tab1[i].getNr_indeksu());
            System.out.println("Nazwa specjalnosci: " + tab1[i].getNazwaSpecjalnosci());
            System.out.println("Rok studiow: " + tab1[i].getRok_studiow());
        }
    }
    private void wyswietlZakres(){
        Scanner in = new Scanner(System.in);
        
        System.out.print(" Podaj poczatek zakresu: ");
        int indexP = in.nextInt();
        System.out.print(" Podaj koniec zakresu: ");
        int indexK = in.nextInt();
        
        for (int i = indexP; i<=indexK; i++){
            System.out.println("Index: " + i);
            System.out.println("Imie: " + tab1[i].getImie());
            System.out.println("Nazwisko: " + tab1[i].getNazwisko());
            System.out.println("Nr indeksu: " + tab1[i].getNr_indeksu());
            System.out.println("Nazwa specjalnosci: " + tab1[i].getNazwaSpecjalnosci());
            System.out.println("Rok studiow: " + tab1[i].getRok_studiow());
            
        }
    }
    
}

    

