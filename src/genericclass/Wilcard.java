package genericclass;

import genericclass.helpers.MyData;

/***
 * Wilcard digunakan untuk melakukan sesuatu pada generic parameter
 * tanpa peduli tipe dari generic parameter tersebut
 * caranya adalah dengan menggunakan tanda ?
 */

public class Wilcard {

    public static void main(String[] args) {

        printLength(new MyData<>(17003));
        printLength(new MyData<>("Khairil"));
        printLength(new MyData<>(true));

    }

    public static void printLength(MyData<?> data){
        System.out.println(data.getData());
    }
}
