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

        BubbleSort bs = new BubbleSort();
        bs.sort(phones, true);

        System.out.println(phones[0].getPrice() + " " + phones[1].getPrice() + " " + phones[2].getPrice());
    }
}