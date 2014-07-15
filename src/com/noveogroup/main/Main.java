package com.noveogroup.main;

import com.noveogroup.device.*;
import com.noveogroup.algorithm.*;

public class Main {

    public static void main(String[] args) {
        //You can check your algorithms here.

        Device[] devices = new Device[3];
        devices[0] = new Phone(25);
        devices[1] = new Tablet(15);
        devices[2] = new Notebook(50);

        System.out.println(devices[0].getPrice() + " " + devices[1].getPrice() + " " + devices[2].getPrice());

        QuickSort bs = new QuickSort();
        bs.sort(devices, true);

        System.out.println(devices[0].getPrice() + " " + devices[1].getPrice() + " " + devices[2].getPrice());
    }
}