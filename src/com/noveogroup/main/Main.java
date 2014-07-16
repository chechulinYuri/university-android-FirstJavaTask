package com.noveogroup.main;

import com.noveogroup.device.*;
import com.noveogroup.algorithm.*;

public class Main {

    static Device[] devices;

    public static void main(String[] args) {
        //You can check your algorithms here.

        devices = new Device[5];
        devices[0] = new Phone(25);
        devices[1] = new Tablet(15);
        devices[2] = new Notebook(50);
        devices[3] = new Notebook(120);
        devices[4] = new Phone(10);

        printDevices();

        BubbleSort bs = new BubbleSort();
        bs.sort(devices, true);

        printDevices();

        InsertionSort is = new InsertionSort();
        is.sort(devices, false);

        printDevices();

        QuickSort qs = new QuickSort();
        qs.sort(devices, true);

        printDevices();
    }

    public static void printDevices() {
        String output = new String();
        for (int i = 0; i < devices.length; i++) {
            output = output.concat(devices[i].getPrice() + " ");
        }
        System.out.println(output);
    }
}