package genericclass;
/***
 * Covariant memungkinkan kita untuk melakukan subtitusi ke
 * subtype (child) dengan supertype (parent) => child ke parent
 * kita dapat membuat covariant dengan menggunakan kata kunci
 * (? extends ParentClass)
 * Data pada covariant tidak dapat diubah atau bersifat read only
 *
 *
 */

import genericclass.helpers.MyData;

public class CovarianGeneric {
    public static void main(String[] args){
        MyData<String> stringMyData = new MyData<>("Khairil");
        process(stringMyData);
    }

    public static void process(MyData<? extends Object> myData){
        System.out.println(myData.getData()); // diperbolehkan

        //myData.setData('Tes'); //error
    }
}
