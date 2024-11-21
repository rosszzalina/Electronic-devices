package org.example.electronicdevices;


public class DeviceTest {
    public static void main(String[] args) {
        // Create an instance of Device (use a subclass, since Device is abstract)
        Device smartphone = new Smartphone("iPhone", 999.99, 0.5, 6.1, 12.0);

        // Print details of the device
        System.out.println("Device Details: " + smartphone);

        // Access and print the device type
        Device.DeviceType type = smartphone.getType();
        System.out.println("Device Type: " + type);

        // Create another device
        Device laptop = new Laptop("MacBook", 1299.99, 2.0, 16, "Intel i7");
        System.out.println("Device Details: " + laptop);
    }
}

