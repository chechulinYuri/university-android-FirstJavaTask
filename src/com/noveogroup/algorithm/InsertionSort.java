package com.noveogroup.algorithm;

import com.noveogroup.device.*;

/**
 * Created by Admin on 15.07.14.
 */
public class InsertionSort extends AbstractAlgorithm {

    public void sort(Device[] devices, boolean ascendingSort) {
        for(int i = 1; i < devices.length; i++){
            Device currElem = devices[i];
            int prevKey = i - 1;
            while(prevKey >= 0 && (devices[prevKey].compareTo(currElem) > 0 && ascendingSort || devices[prevKey].compareTo(currElem) < 0 && !ascendingSort)){
                devices[prevKey+1] = devices[prevKey];
                devices[prevKey] = currElem;
                prevKey--;

            }
        }
    }
}
