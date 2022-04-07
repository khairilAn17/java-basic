package genericclass;

import genericclass.helpers.MyData;

/***
 * Generic parameter bersifat invariant artinya tidak dapat di subtitusi ke subtype (child)
 * maupun ke supertype(parent) contoh: MyData<String> tidak dapat di subtitusi menjadi MyData<Object>
 * begitun sebaliknya. MyData<Object> tidak dapat disubtitusi menajdi MyData<String>
 */
public class InvariantGeneric {
    public static void main(String[] args) {
        //contoh error substitusi supertype
        MyData<String> stringMyData = new MyData<>("this is String");
       // MyData<Object> objectMyData = stringMyData; // error

        //contoh error subtype
        MyData<Object> objectMyData1 = new MyData<>(100);
       // MyData<Integer> integerMyData = objectMyData1; // error
    }
}
