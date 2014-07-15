package com.noveogroup.device;

/**
 * Created by Admin on 15.07.14.
 */
public abstract class AbstractDevice implements Device {

    private int price;

    public AbstractDevice(int pr) {
        price = pr;
    }

    @Override
    public int compareTo(Device device) {
        return this.getPrice() - device.getPrice();
    }

    public int getPrice() {
        return price;
    }
}
