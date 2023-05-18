/*
1.Napisz program generujący jednowymiarową tablice liczb (10 elementów).
        Program powinien posortować tablicę przy pomocy algorytmu sortowania przez wstawianie lub przez wybranie (do wyboru, dla chętnych oba algorytmy).
        Wynikiem działania programu ma być wyświetlona tablica przed sortowaniem oraz posortowana.
*/

import java.util.Random;

public class Zadanie1 {
    public static void main(String[] args) {


        int[] tablica = new int[10];

        Random random = new Random();

        for (int i = 0; i < tablica.length; i++){
            tablica[i] = random.nextInt(21);
        }

        for (int i = 0; i< tablica.length;i++){
            System.out.print(tablica[i] + " ");
        }

        for (int i = 0; i < tablica.length; i++){
                if(tablica[i] > tablica[i+1]){
                    int temp = tablica[i];
                     tablica[i] = temp;
                }
            }

        for (int i = 0; i< tablica.length;i++){
            System.out.print(tablica[i] + " ");
        }


    }
}
