package algorytmy;

/*Przygotuj algorytm wyświetlający palindrom, czyli liczbę, która czytana od tyłu będzie taka sama jak od przodu.
1. Przedstaw opis słowny problemu
2. Przedstaw schemat blokowy
3. Zaimplementuj algorytm.
Rozwinięcie:
2. Z wykorzystaniem jednej pętli
3. Sprawdź czy napisy są palindromami
   - mozejutrotadamadatortujezom
   - mozejutrotaadamadatortujezom
   */

import java.util.Scanner;

public class Zadanie5 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Podaj liczbe:");
        String cyfra = s.nextLine();


        for (int i = 0; i < cyfra.length(); i++) {
            char first = cyfra.charAt(i);
            char last = cyfra.charAt(cyfra.length() - 1 - i);
            if (first == last) {
                System.out.println("Jest palindromem.");
                break;
            } else {
                System.out.println("Nie jest palindromem.");
                break;
            }
        }

    }

}
