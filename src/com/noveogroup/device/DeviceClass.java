package com.noveogroup.device;

/**
 * Created by Admin on 15.07.14.
 */
public class DeviceClass extends AbstractDevice {
    private int price;

    public DeviceClass(int pr) {
        price = pr;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public int compareTo(Device device) {
        return device.getPrice() - price;
    }
}
