package pl.camp.it;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Suma {
    public static void main(String[] args) {
        List<Integer> liczby = new ArrayList<>();
        Random random = new Random();

        for(int i = 0; i < 10; i++) {
            liczby.add(random.nextInt(100));
        }

        System.out.println(liczby);
        int suma = sum(liczby);

        System.out.println("Suma: " + suma);
    }

    public static int sum(List<Integer> list) {
        if(list.size() == 1) {
            return list.get(0);
        }
        int result = list.get(0);
        list.remove(0);
        return result + sum(list);
    }
}
