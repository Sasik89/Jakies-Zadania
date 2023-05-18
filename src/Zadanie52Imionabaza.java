import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Zadanie52Imionabaza {

    List<Zadanie52Imiona> baza = new ArrayList<Zadanie52Imiona>();

    Scanner scanner = new Scanner(System.in);

    public void addNameAndSurname() {
        System.out.println("Ile danych chcesz podać?");
        int a = Integer.parseInt(scanner.nextLine());  //użyłem parsowania ze względu na to że pozostała spacja w pamięci psuła mi wpisywanie imion i nazwisk
        for (int i = 0; i < a; i++) {
            baza.add(new Zadanie52Imiona(addName(), addSurname()));
        }
    }

    public void showdate(Zadanie52Imionabaza baza){
        for (Zadanie52Imiona osoba : this.baza) {
            System.out.println(osoba.getImie() + " " + osoba.getNazwisko());
        }
    }

    public String addName(){
        System.out.println("Podaj imie");
        return scanner.nextLine();
    }

    public String addSurname(){
        System.out.println("Podaj naziwsko");
        return scanner.nextLine();
    }


    public void setBaza(List<Zadanie52Imiona> baza) {
        this.baza = baza;
    }

    public Zadanie52Imionabaza() {
        this.baza = baza;


    }
}
