package com.noveogroup.main;

import com.noveogroup.device.*;
import com.noveogroup.algorithm.*;

public class Main {

    public static void main(String[] args) {
        //You can check your algorithms here.

        Phone[] phones = new Phone[3];
        phones[0] = new Phone(10);
        phones[1] = new Phone(2);
        phones[2] = new Phone(5);

        System.out.println(phones[0].getPrice() + " " + phones[1].getPrice() + " " + phones[2].getPrice());

        QuickSort bs = new QuickSort();
        bs.sort(phones, false);

        System.out.println(phones[0].getPrice() + " " + phones[1].getPrice() + " " + phones[2].getPrice());
    }
}