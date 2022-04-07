package genericclass;

import genericclass.helpers.MyData;

/***
 * Contravariant merupakan kebalikan dari covariant
 * Contravarant dapat melakukan subtitusi dari parent ke child
 * menggunakan kata kunci (? super SubClass)
 * dapat melakukan read & write, namun untuk read perlu dilakukan dengan hati2
 */

public class ContraVariant {

    public static void main(String[] args) {
        MyData<Object> objectMyData = new MyData<>("Anwar");

        MyData<? super String> myData = objectMyData;

        process(objectMyData);
        System.out.println(objectMyData);
    }

    public static void process(MyData<? super String> myData){
        myData.setData("Khairil Anwar");
    }
}
