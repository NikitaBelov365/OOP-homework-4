package task1;

public class PrintElementDemo {
    public static void main(String[] args) {
        PrintElement<Integer> iObject = new PrintElement<>(25);
        PrintElement<Double> dObject = new PrintElement<>(2.67666235);
        PrintElement<String> sObject = new PrintElement<>("Homework");

        iObject.print();
        dObject.print();
        sObject.print();
    }

}
