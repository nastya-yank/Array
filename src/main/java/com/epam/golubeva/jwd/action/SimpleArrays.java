package com.epam.golubeva.jwd.action;

import com.epam.golubeva.jwd.entity.SimpleArray;

import java.util.Arrays;

public class SimpleArrays {
    public static int min(SimpleArray simpleArray) {
        if (simpleArray == null) {
            throw new NullPointerException("Array is empty!");
        }
        return Arrays
                .stream(simpleArray.getArray())
                .min()
                .getAsInt();

    }

    public static int max(SimpleArray simpleArray) {
        if (simpleArray == null) {
            throw new NullPointerException("Array is empty");
        }
        return Arrays
                .stream(simpleArray.getArray())
                .max()
                .getAsInt();
    }

    public static void change(SimpleArray simpleArray, int from, int to, int change) {
        if (simpleArray == null) {
            throw new NullPointerException("Array is empty");
        }
        if (from > to) {
            throw new RuntimeException(" Value 'From' is more that value 'to'");
        }
        for (int i = from; i < to; i++) {
            simpleArray.getArray()[i] = change;
        }
    }

    public static double meanValue(SimpleArray simpleArray) {
        if (simpleArray == null) {
            throw new NullPointerException("Array is empty");
        }
        double meanValue = 0;
        for (int i : simpleArray.getArray()) {
            meanValue += i;
        }
        return meanValue / simpleArray.getArray().length;
    }

    public static int counterPositive(SimpleArray simpleArray) {
        if (simpleArray == null) {
            throw new NullPointerException("Array is empty");
        }
        int counter = 0;
        for (int i : simpleArray.getArray()) {
            if (i >= 0) {
                counter++;
            }
        }
        return counter;
    }

    public static int counterNegative(SimpleArray simpleArray) {
        if (simpleArray == null) {
            throw new NullPointerException("Array is empty");
        }
        int counter = 0;
        for (int i : simpleArray.getArray()) {
            if (i < 0) {
                counter++;
            }
        }
        return counter;
    }

    public static void simpleSort(SimpleArray simpleArray) {

        if (simpleArray == null) {
            throw new NullPointerException("Array is empty");
        }

        for (int i = 0; i < simpleArray.getArray().length - 1; i++) {

            for (int j = i + 1; j < simpleArray.getArray().length; j++) {

                if (simpleArray.getArray()[i] > simpleArray.getArray()[j]) {

                    int bubble = simpleArray.getArray()[i];
                    simpleArray.getArray()[i] = simpleArray.getArray()[j];
                    simpleArray.getArray()[j] = bubble;
                }
            }

        }
    }

    public static void selectSort(SimpleArray simpleArray) {

        if (simpleArray == null) {
            throw new NullPointerException("Array is empty");
        }

        for (int left = 0; left < simpleArray.getArray().length; left++) {

            int value = simpleArray.getArray()[left];
            int i = left - 1;

            for (; i >= 0; i--) {

                if (value < simpleArray.getArray()[i]) {

                    simpleArray.getArray()[i + 1] = simpleArray.getArray()[i];

                } else {
                    break;
                }
            }
            simpleArray.getArray()[i + 1] = value;
        }
    }
    public static void sortShell(SimpleArray simpleArray){

        if (simpleArray == null) {
            throw new NullPointerException("Array is empty");
        }
        int gap = simpleArray.getArray().length / 2;
        while (gap >= 1) {
            for (int right = 0; right < simpleArray.getArray().length; right++) {
                for (int c = right - gap; c >= 0; c -= gap) {
                    if (simpleArray.getArray()[c] > simpleArray.getArray()[c + gap]) {
                        int bubble= simpleArray.getArray()[c];
                        simpleArray.getArray()[c]=simpleArray.getArray()[c+gap];
                        simpleArray.getArray()[c+gap]=bubble;

                    }
                }
            }
            gap = gap / 2;
        }
    }
}
