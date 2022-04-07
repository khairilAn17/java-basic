package genericclass;

/***
 * Kita juga dapat membatasi type data pada generic type
 * karena pada dasarnya generic type memiliki type object
 * yg mana itu bisa menjadi type data apa saja. Caranya adalah
 * T extends TipeData, cth: T extends Number
 */

public class ConstrainApp {
    public static void main(String[] args) {

        NumberData<Integer> integerNumberData = new NumberData<>(1);
        NumberData<Long> longNumberData = new NumberData<>(1L);

//        NumberData<String> stringNumberData = new NumberData<String>("Error") error karena type data String bukan turunan Number

    }

    public static class NumberData<T extends Number>{
        private T data;

        public NumberData(T data) {
            this.data = data;
        }

        public T getData() {
            return data;
        }

        public void setData(T data) {
            this.data = data;
        }
    }
}
