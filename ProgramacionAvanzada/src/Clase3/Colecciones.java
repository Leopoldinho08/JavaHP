package Clase3;

import java.util.ArrayList;
import java.util.List;

public class Colecciones {

    public static void main(String[] args) {

        List<String> words = new ArrayList<>();

        words.add("this");
        words.add("and");
        words.add("that");
        words.add(1,"these");
        // Existe tambien add(int index, Object obj)

        System.out.println(words);
    }
}
