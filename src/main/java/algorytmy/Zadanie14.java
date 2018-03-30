package algorytmy;

import java.io.File;


public class Zadanie14 {
    public static void main(String[] args) {
        File f = new File(".");

        System.out.println(f.getAbsoluteFile());

        File[] files = f.listFiles();
        for (File child : files){
            System.out.println(child.getAbsolutePath());
            System.out.println("isDirectory "+ child.isDirectory()+", name "+ child.getAbsolutePath());


        }
    }
}

