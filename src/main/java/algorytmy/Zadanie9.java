package algorytmy;

import java.util.LinkedList;

public class Zadanie9 {
    public static void main(String[] args) {
        LinkedList<String>linkedList = new LinkedList<>();

        String napis = "napis";
        for (int i = 0; i < napis.length() ; i++) {
            linkedList.push(String.valueOf(napis.charAt(i)));

        }

        int count = linkedList.size();

        for (int i = 0; i<count; i++){
            System.out.println(linkedList.pop());
        }





    }

}
