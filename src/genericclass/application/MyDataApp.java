package genericclass.application;
import genericclass.helpers.MyData;

/***
 * Type parameter yg digunakan pada parameter generic ada tipe data Object bukan primitif
 */
public class MyDataApp {
    public static void main(String[] args) {
        //setting parameter generic sebagai String
        MyData<String> stringMyData = new MyData<>("Khairil Anwar");
        //setting parameter generic sebagai Integer
        MyData<Integer> integerMyData = new MyData<>(170396);

        System.out.println(stringMyData.getData()); // memanggil getData() dari class Mydata
        System.out.println(integerMyData.getData()); // memanggil getData() dari class Mydata
    }
}
