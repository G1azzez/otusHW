package ru.otus;

public class ArrayMaker {
    static int[] getArray(int lenght, int base, int[] toSort) {

        for (int i = 0; i < lenght; i++) {
            toSort[i] = (int) (Math.random() * base);
        }
        return toSort;
    }

}

