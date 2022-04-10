package collection;

/***
 * Iterable merupakan super interacae dari semua iteration yg bukan Map
 * Iterable digunakan sebagai contract class untuk meng-iterasi data secara sequential
 */

import java.util.Iterator;
import java.util.List;

public class IterableApp {
    public static void main(String[] args) {
        Iterable<String> names = List.of("khairil", "anwar");


        // Iterator menggunakan for-each
        for (var name: names){
            System.out.println(name);
        }

        //Iterator manual menggunakan while

        Iterator<String> iterator = names.iterator();

        while(iterator.hasNext()){
            String name = iterator.next();
            System.out.println(name);
        }
    }
}
