package collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/***
 * List di Java secara default bersifat mutable atau dapat dihapus
 * List memiliki sifat :
 *  Element di list dapat duplikat,
 *  Data list berurut sesuai dengan kita memasukkan data
 *  List memiliki index
 * List merupakan turunan Collection
 * List terbagi menjadi dua, yaitu: ArrayList dan LinkedList
 * 1. ArrayList: Implementasi dari list yg menggunakan Array
 *               Default kapasitas ArrayList adalah 10
 *               ketika menambahkan data ke ArrayList namun kapasitas telah
 *               terpenuhi maka secara otomatis ArrayList akan menambah kapasitas
 * 2. LinkedList: Implementasi list dengan struktur data Double Linked List
 *
 * Perbandingan
 *
 * -----------------------------------------------------------------------------
 * Operasi      ArrayList                               LinkedList
 * -----------------------------------------------------------------------------
 * add          Cepat jika kapasitas masih cukup,       Cepat karena hanya menambah node akhir
 *              lambat jika sudah penuh
 * get          Cepat karenat tinggal menggunakan       Lambat karena harus cek dari node awal sampai
 *              index array                             node yg dituju
 * set          Cepat karena tinggal gunakan index      Lambat karena harus cek dari node awal sampai
 *              array                                   node yg dituju
 * remove       lambat karena harus menggeser data      Cepat karena tinggal ubah prev dan next di node
 *              dibelakang yg dihapus                   sebelah yg dihapus
 */

public class ListApp {
    public static void main(String[] args) {
        //Contoh ArrayList
        List<String> names = new ArrayList<>();
        //tambah data
        names.add("Khairil");
        names.add("anwaer");

        //set data
        names.set(0, "keren");
        System.out.println(names.get(0));

        List<String> names2 = new LinkedList<>();
        names2.add("Budi");
        names2.set(0, "Ani");

        for (var name: names2){
            System.out.println(name);
        }
    }
}
