package task4;

public class Main {
    public static void main(String[] args) {
        String[] iArr = {"One", "Three", "Five"};
        DataContainer<String> myIntArr = new DataContainer<>(iArr);
        myIntArr.add("Eleven");
        System.out.println(myIntArr.get(3));
        myIntArr.print();
        myIntArr.sort();
        myIntArr.print();
    }
}
