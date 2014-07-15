package com.noveogroup.algorithm;

import com.noveogroup.device.Device;

/**
 * Created by Admin on 15.07.14.
 */
public class BubbleSort extends AbstractAlgorithm {

    public void sort(Device[] devices, boolean ascendingSort) {
        for(int i = 0; i < devices.length; i++)
            for(int j = 0; j < devices.length - i - 1; j++)
                if(devices[j].compareTo(devices[j + 1]) > 0 && ascendingSort || devices[j].compareTo(devices[j + 1]) < 0 && !ascendingSort) {
                    Device tmp = devices[j];
                    devices[j] = devices[j + 1];
                    devices[j + 1] = tmp;
                }
    }
}
