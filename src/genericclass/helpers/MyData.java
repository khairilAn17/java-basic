package genericclass.helpers;

/***
 * Java Class dengan satu generic parameter. Parameter bisa lebih dari
 * Parameter tidak harus satu huruf dan kapital. Bisa saja banyak huruf dan huruf kecil
 * Namun normalnya digunakan satu huruf kapital di mana T berarti Type, E berarti Element dll
 *
 * @param <T>
 */

public class MyData <T>{

    private T data; // variable dengan generic parameter

    public MyData(T data){
        this.data = data;
    }
    public T getData(){
        return data;
    }

    public void setData(T data){
        this.data = data;
    }
}
