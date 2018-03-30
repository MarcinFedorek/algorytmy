package algorytmy;

import java.util.LinkedList;

//zadanie17

public class Zadanie8 {

    public static LinkedList<Integer> bin(Integer n) {
        LinkedList<Integer> stos = new LinkedList<>();
        Integer m = n;
        for (; m > 0; ) {
            stos.push(m % 2);
            m = m / 2;
        }
        return stos;

    }


    public static void main(String[] args) {
        System.out.println(bin(4));

    }


}
