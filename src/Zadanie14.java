/*
14.Napisz program który generuje tablicę liczb 0 i 1 (10 elementów). Program ma sprawdzić czy tablica jest symetryczna -
pierwszy element taki jak ostatni, drugi taki jak przedostatni itd. Tablica ma być generowana dopuki nie zostanie zachowana symetria;
Wprowadzić licznik
*/

import java.util.Random;
public class Zadanie14 {
    public static void main(String[] args) {

        int[] tablica = new int[10];

        Random random = new Random();
        boolean run = true;
        boolean loop2 = true;
        int counter = 0;


            while (run) {
                counter++;
                for (int i = 0; i < tablica.length; i++) {
                    tablica[i] = random.nextInt(2);
                }
                int j = 9;
                for (int i = 0; i < tablica.length; i++) {
                    if (tablica[i] != tablica[j]) {
                        j--;
                        run = true;
                        break;
                    } else {
                        j--;
                        run = false;
                    }
                    if (run) break;
                }
            }


        for (int i = 0; i < tablica.length; i++) {
            System.out.print(tablica[i] + " ");

        }
        System.out.println();
        System.out.println("----------");
        System.out.print("Tablica zostałą wygenerowana za " + counter + " razem");

    }
}
