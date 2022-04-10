package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

/***
 * Collection merupakan contract untuk memanipulasi data collection
 * Collection tidak memiliki direct implementation, karena collection
 * dibagi menjadi tiga yaitu : List, Set dan Queue
 */

public class CollectionApp {
    public static void main(String[] args) {
        Collection<String> names = new ArrayList<>();
        //manipulasi untuk menambah data
        names.add("Khairil");
        names.add("Anwar");
        names.addAll(Arrays.asList("Budi", "Ani"));

        //manipulasi untuk menghapus data
        names.remove("Budi");
        for (var name: names){
            System.out.println(name);
        }
    }
}
