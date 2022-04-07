package genericmethod.application;

import genericmethod.helpers.ArrayHelper;

public class ArrayApp {
    public static void main(String[] args) {
        String[] names = {"Khairil", "Anwar", "keren"};
        Integer[] numbers = {1, 2, 3, 4, 5};
        System.out.println(ArrayHelper.count(names));
        System.out.print(ArrayHelper.<Integer>count(numbers)); // meletakkan type parameter adalah optional karena type nya akan otomatis mengikuti deklarasi pertama
    }
}
