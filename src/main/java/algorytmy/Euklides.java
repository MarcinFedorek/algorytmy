package algorytmy;

public class Euklides {
    public static void main(String[] args) {
        System.out.println("Start");


        Integer nwd = nwd(15,5);
        System.out.println("Największy wspólny dzielnik liczb 15 i 5 to: "+nwd);
        System.out.println("Koniec");

    }

    private static Integer nwd(int i, int j) {
        while (i != j) {
            if (i > j) {
                i = i - j;
            } else j = j - i;
        }return i;
    }


}
