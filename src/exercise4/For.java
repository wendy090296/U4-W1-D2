package exercise4;

import java.util.Scanner;

public class For {
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);
        System.out.println("Inserisci qui un numero intero e premi INVIO:");
        int numeroInserito=scanner.nextInt();

      for(int i=numeroInserito -1; i>0; i--){
          System.out.println( i );

        }
        if (numeroInserito <= 0) System.out.println("Il numero deve essere maggiore di 0!");



        scanner.close();

    } // il conto alla rovescia non mi arriva a 0.
}
