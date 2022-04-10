package collection;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class ImmutableSetApp {
    public static void main(String[] args) {
        Set<String> empty = Collections.emptySet(); // untuk membuat immutable set kosong
        Set<String> one = Collections.singleton("Khairil"); //untuk membuat immutable set satu data

        Set<String> mutable = new HashSet<>();
        mutable.add("Khairil");
        mutable.add("Anwar");
        Set<String> immutable = Collections.unmodifiableSet(mutable);// mengubah mutable set ke immutable set
    }
}
