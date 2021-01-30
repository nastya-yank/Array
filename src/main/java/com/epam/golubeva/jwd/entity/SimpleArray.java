package com.epam.golubeva.jwd.entity;

public class SimpleArray {
    private int[] array;

    public SimpleArray(int... array) {
        this.array = array;
    }

    public SimpleArray(int n) {
        array = new int[n];
    }

    public SimpleArray() {
        array = new int[10];
    }

    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }
}
