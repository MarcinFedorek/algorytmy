package algorytmy;

import java.util.*;

public class Zadanie7 {


    public static void main(String[] args) {
        List<Integer>lista = new LinkedList<>();
        List <Integer>linkedList = new ArrayList<>();
        Random random = new Random();
        long start = new Date().getTime();

        for (int i = 0; i <100000 ; i++) {
                linkedList.add(random.nextInt());
        }
        System.out.println("Dodaj na końcu" +(new Date().getTime()-start)+"ms");

         start = new Date().getTime();


        linkedList = new ArrayList<>();
        for (int i = 0; i <100000 ; i++) {
            linkedList.add(0,random.nextInt());
        }
        System.out.println("Dodaj na początku" +(new Date().getTime()-start)+"ms");

        System.out.println("******************************");
           long czas = new Date().getTime();
        for (int i = 0; i < 100000; i++) {
            lista.add(random.nextInt());

        }
        System.out.println("Dodaj na początku" +(new Date().getTime()-czas)+"ms");

        lista = new LinkedList<>();
        for (int i = 0; i < 100000; i++) {
            lista.add(0,random.nextInt());

        }System.out.println("Dodaj na koncu" +(new Date().getTime()-czas)+"ms");


        System.out.println("***************************");


        long starter = new Date().getTime();
        for (int i = 0; i <50 ; i++) {
            linkedList.remove(i);

        }
        System.out.println("Czas: "+(new Date().getTime()- starter)+"ms");

        for (int i = 0; i <50 ; i++) {
            lista.remove(i);

        }
        System.out.println("Czas na końcu: "+(new Date().getTime()- starter)+"ms");

        System.out.println(lista.isEmpty());
        System.out.println(lista.size());
    }
}
