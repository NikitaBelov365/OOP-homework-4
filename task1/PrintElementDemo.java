package task1;

public class PrintElementDemo {
    public static void main(String[] args) {
        Printer<Integer> iObject = new Printer<>(25);
        Printer<Double> dObject = new Printer<>(2.67666235);
        Printer<String> sObject = new Printer<>("Homework");

        iObject.printElement();
        dObject.printElement();
        sObject.printElement();
    }

}
