/*
Utwórz klasę Punkt, która przechowuje dwie wartości typu int - współrzędne punktu na powierzchni. Napisz w niej także metody które:
        zwiększają wybraną współrzędną o 1
        zmieniają wybraną zmienną o dowolną wartość
        zwracają wartość współrzędnych (oddzielne metody)
        wyświetla wartość współrzędnych
        Napisz także klasę, w której przetestujesz działanie metod wyświetlając działanie metod na ekranie.
*/

public class Zadanie51Punkt {

    int x = 1;
    int y = 2;

    public void zwiekszX(int x){
        this.x = x+1;
        System.out.println("x: " + x);
    }

    public void zwiekszY(int y){
        this.y = y+1;
        System.out.println("y: " + y);
    }

    public void ZmienY(int wartosc){
        this.y = wartosc;
        System.out.println(y);
    }

    public void ZmienX(int wartosc){
        this.x = wartosc;
        System.out.println(x);
    }

        public void show(){
            System.out.println("X: " + this.x);
            System.out.println("Y: " + this.y);
        }

}
