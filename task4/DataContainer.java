package task4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;


public class DataContainer<T extends Comparable<T>> {
    private ArrayList<T> myArr;

    public DataContainer(T[] myArr) {
        this.myArr = new ArrayList<>(Arrays.asList(myArr));
    }

    public void add(T item) {
        myArr.add(item);
    }

    public T get(int a) {
        return myArr.get(a);
    }

    public void print() {
        System.out.println(myArr.toString());
    }

    public void sort() {
        Comparator<T> comparator = new Comparator<T>() {

            @Override
            public int compare(T o1, T o2) {
                return o2.compareTo(o1);
            }
        };

        Collections.sort(myArr, comparator);
    }
}
