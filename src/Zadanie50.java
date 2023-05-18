//Utwórz tablicę typu int przechowującą n elementów - gdzie n jest parametrem pobieranym od użytkownika.
// Następnie wypełnij ją liczbami od 1 do n i wyświetl zawartość na ekranie przy pomocy pętli while.

import java.util.Scanner;

public class Zadanie50 {
    public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj jaką chcesz duża tablice");

        int n = scanner.nextInt();

        int[] tablica = new int[n];

        for (int i=0; i < tablica.length; i++){
            tablica[i] = i+1;
        }

        for (int i=0; i < tablica.length; i++){
            System.out.println(tablica[i]);
        }
}}
