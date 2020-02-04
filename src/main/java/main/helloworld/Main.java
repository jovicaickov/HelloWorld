package main.helloworld;

import java.util.Scanner;
/**
 *
 * @author qa
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Hello World");
        System.out.println("Jovica Ickov");
        
        int age = 5;
        
        if (age > 18) {
           System.out.println("Osoba je punoletna.");
        } else {
           System.out.println("Osoba je maloletna.");
        }
        
        System.out.print("Unesite broj godina: ");
        Scanner input = new Scanner(System.in);
        int userAge = input.nextInt();
        
        System.out.println("Korisnik je uneo " + userAge);
        
        if (userAge <= 0 && userAge > 150) {
           System.out.println("Osoba je beba.");
        } else if (userAge <= 5) {
           System.out.println("Osoba je dete.");
        } else if (userAge <= 11) {
           System.out.println("Osoba je dete.");
        } else if (userAge <= 17) {
           System.out.println("Osoba je tinejdzer.");
        } else if (userAge >= 18) {
           System.out.println("Osoba je odrasla.");
        }
        
    }
    
}
