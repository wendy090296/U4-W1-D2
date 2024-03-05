package exercise3;

import java.util.Objects;
import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //  nuovo scanner


        while (true) {
            System.out.println("Inserisci qui una parola e premi INVIO");// messaggio per utente
            String inputWord = scanner.nextLine();// attesa input

            if (Objects.equals(inputWord, ":q")) {
                System.out.println("Si esce dal ciclo.");
                break;

            }
            String[] singoliCaratteri = inputWord.split(""); // suddivido stringa in caratteri singoli

            for (int i = 0; i < singoliCaratteri.length; i++) {
                System.out.println(singoliCaratteri[i] + " , ");



            }
            scanner.close();


        } // perché mi da errore ?
    }
}
