package task3;

public class Maxer {
    public static <T extends Comparable<T>> T getMax(T a, T b) {
        if (a.compareTo(b) > 0) {
            return a;
        } else {
            return b;
        }
    }
}