package task1;


public class Printer<T> {

    private T object;

    public Printer(T object) {
        this.object = object;
    }

    void printElement() {
        System.out.println(object);
    }
}
