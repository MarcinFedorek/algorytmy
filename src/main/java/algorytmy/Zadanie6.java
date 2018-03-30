package algorytmy;

/*Napisz funkcję, która narysuje na ekranie prostokąt (z dowolnych znaków)
a. pełną figurę
b. sam obrys
1. Przedstaw opis słowny problemu
2. Przedstaw schemat blokowy
3. Zaimplementuj algorytm.
Rozwinięcie:
2. Narysuje trójkąt
3. Narysuje trójkąt nieprostokątny (równoramienny, równoboczny)
4. Narysuje koło/okrąg
*/

public class Zadanie6 {

    public static void zbudujFigure(int k, int j) {
        for (int i = 0; i < k; i++) {
            System.out.println("*");
            if (i==1||j==8){
                System.out.println("*");
            }


        }


    }


    public static void main(String[] args) {

    }

}
