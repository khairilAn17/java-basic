package collection;

import collection.data.Person;

import java.util.List;

public class MutableApp {

    public static void main(String[] args) {
        Person person = new Person("Khairil");
        person.addHobby("Coding");
        person.addHobby("reading book");
        doSomethingWithHobbies(person.getHobbies()); //code ini dapat mengubah hobbies karena bersifat mutable
        for (String hobby: person.getHobbies()){
            System.out.println(hobby);
        }
    }

    public static void doSomethingWithHobbies(List<String> hobbies){
        hobbies.add("this is not hobby");
    }
}
