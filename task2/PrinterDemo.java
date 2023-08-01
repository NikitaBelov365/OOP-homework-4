package task2;

public class PrinterDemo {
    public static void main(String[] args) {
        Integer[] iArr = new Integer[] {1,2,3};
        String[] sArr = new String[] {"One", "Two", "Three"};

        Printer.<Integer>print(iArr);
        Printer.<String>print(sArr);
    }
}
