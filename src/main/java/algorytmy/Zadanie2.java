package algorytmy;

//Algorytm ma wczytywać z klawiatury wartości dwóch liczb oraz wyświetlać w kolejnych liniach następujące wyniki:
//1. Wykorzystując TYLKO dodawanie pomnożyć pierwszą liczbę przez drugą.
//2. Wykorzystując TYLKO dodawanie spotęgować pierwszą liczbę przez drugą.
//1. Przedstaw opis słowny problemu
//2. Przedstaw schemat blokowy
//3. Zaimplementuj algorytm.


public class Zadanie2 {


    private static int multiply(int a, int b) {
        int c = 0;
        for (int i = 0; i < b; i++) {
            c += a;
        }
        return c;
    }

    private static int potega(int a, int b) {
        int c = a;
        for (int i = 0; i < b - 1; i++) {
            c = multiply(a, c);
        }
        return c;
    }

    public static void main(String[] args) {


        System.out.println(potega(2, 3));


    }
}
