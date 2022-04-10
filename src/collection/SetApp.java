package collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

/***
 * Set tidak terdapat duplikat, jika ada data yg duplikat
 * set hanya akan mengambil salah satu diantaranya
 * Set tidak memiliki index, oleh karena itu data di set tidak terjamin terurut
 * Set tidak memiliki method baru jadi hanya menggunakan method dari parent (iterable -> collection)
 * Untuk mengambil data dari set harus diiterasi satu per satu
 *
 * HashSet vs LinkedHashSet
 * -----------------------------------------------------------------------------------
 * Data di linkedHashSet terurut sedangkan di HashsSet belum tentu
 */

public class SetApp {
    public static void main(String[] args) {
        Set<String> names = new HashSet<>();
        names.add("Khairil");
        names.add("Anwar");
        names.add("keren");

        for (var name: names){
            System.out.println(name);// hasilnya tidak berurut
        }

        Set<String> names2 = new LinkedHashSet<>();
        names2.add("Khairil");
        names2.add("Anwar");
        names2.add("keren");

        for (var name: names2){
            System.out.println(name);// hasilnya tidak berurut
        }
    }
}
