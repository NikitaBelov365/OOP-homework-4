package task1;


public class PrintElement<T> {

    private T object;

    public PrintElement(T object) {
        this.object = object;
    }

    void print() {
        System.out.println(object);
    }
}
