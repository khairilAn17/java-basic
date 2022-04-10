package genericclass;

import genericclass.helpers.Person;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Comparable {
    public static void main(String[] args){
        Person[] people ={
                new Person("Khairil", "Indonesia"),
                new Person("Anwar", "Indonesia"),
                new Person("Budi", "Indonesia")
        };

        Arrays.sort(people);

        System.out.println(Arrays.toString(people));
    }
}
