package collection.data;

/***
 * Untuk membuat immutable list dapat dilakukan dengan cara:
 * -------------------------------------------------------------
 * method                                Keterangan
 * -------------------------------------------------------------
 * Collections.emptyList()               Membuat immutable list kosong
 * Collections.singletonList(e)          Membuat immutable list berisi satu element
 * Collections.unmodifiableList(list)    Mengubah mutable list menjadi immutable
 * List.of(e...)                         Membuat immutable list dari element-element
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Person {
  private String name;
  private List<String> hobbies;

    public Person(String name) {
        this.name = name;
        this.hobbies = new ArrayList<>();
    }

    public void addHobby(String hobby){
      hobbies.add(hobby);
  }

  public List<String> getHobbies(){
      //return hobbies; // ini akan bersifat mutable
      return Collections.unmodifiableList(hobbies); // ini akan bersifat immutable
  }

  public String getName(){
      return name;
  }
}
