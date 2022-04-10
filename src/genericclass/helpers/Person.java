package genericclass.helpers;

/***
 * Comparable digunakan untuk membanding object. Tidak seperti equals yg hanya
 * membanding apakah object sama atau tidak, Comparable dapat digunakan untuk
 * membandingkan kurang dari, lebih dari dll
 */

public class Person implements Comparable<Person>{
    String name;
    String address;

    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    @Override
    public int compareTo(Person o) {
        return this.name.compareTo(o.name);
    }
}
