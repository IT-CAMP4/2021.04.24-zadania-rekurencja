package pl.camp.it;

public class Potega {
    public static void main(String[] args) {
        int a = 5;
        int b = 3;

        int wynik = power(a, b);

        System.out.println("Wynik: " + wynik);
    }

    public static int power(int a, int b) {
        if(b == 1) {
            return a;
        }
        return a * power(a, b-1);
    }
}
