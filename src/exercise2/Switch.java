package exercise2;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // inizializzo scanner
        System.out.println("Caro utente, inserisci per favore un numero compreso tra 0 e 3 e premi Invio:");//messaggio x utente
        int input = (scanner.nextInt()); // attendo l'input dall'utente
        System.out.println("Hai inserito il valore : " + input);


        switch (input) {
            case 0:
                System.out.println("Z-E-R-O");
                break;
            case 1:
                System.out.println("U-N-O");
                break;
            case 2:
                System.out.println("D-U-E");
                break;
            case 3:
                System.out.println("T-R-E");
                break;
            default:
                System.out.println("Questo numero non risulta valido");
        }
        scanner.close();


    }
}
