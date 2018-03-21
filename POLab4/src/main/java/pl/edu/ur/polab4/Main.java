package pl.edu.ur.polab4;

import java.util.Scanner;

public class Main {

    /**
     * @author Lukasz Kusta
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO zad 4, 5
   
   Scanner scan = new Scanner(System.in);
      System.out.println("Podaj imie, nazwisko, numer indeksu, kierunek, rok studiow: ");
      String imie = scan.next();
      String nazwisko = scan.next();
      int numer_albumu = scan.nextInt();
      String kierunek= scan.next();
      int rok_studiow=scan.nextInt();
      
 
      Student student1 = new Student(imie,nazwisko,numer_albumu,kierunek,rok_studiow);
       student1.PokazDane();
 
       System.out.println("--------------------------");
 
       Student student2 = new Student(imie, nazwisko);
       student2.PokazDane();
 
       System.out.println("--------------------------"); 
 
       Student student3 = new Student(2883);
       student3.PokazDane();
 
       System.out.println("--------------------------"); 
 
       Student student4 = new Student("Lukasz", "Kusta", "Informatyka");
       student4.PokazDane();
 
    }
 
}