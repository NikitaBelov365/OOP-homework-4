package task3;

public class MaxerDemo {
    public static void main(String[] args) {

            Integer intMax = Maxer.getMax(5, 10);
            System.out.println(intMax);

            Double doubleMax = Maxer.getMax(3.14, 2.71);
            System.out.println(doubleMax);

            String stringMax = Maxer.getMax("Hello", "World");
            System.out.println(stringMax);
        }
    }

