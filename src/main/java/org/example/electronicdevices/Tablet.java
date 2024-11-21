package org.example.electronicdevices;


// Tablet class inherits from Device
public class Tablet extends org.example.electronicdevices.Device {
    private double batteryLife;
    private boolean hasStylus;

    // Constructor
    public Tablet(String name, double price, double weight, double batteryLife, boolean hasStylus) {
        super(DeviceType.TABLET, name, price, weight);
        this.batteryLife = batteryLife;
        this.hasStylus = hasStylus;
    }

    // Getters and Setters
    public double getBatteryLife() {
        return batteryLife;
    }

    public void setBatteryLife(double batteryLife) {
        this.batteryLife = batteryLife;
    }

    public boolean isHasStylus() {
        return hasStylus;
    }

    public void setHasStylus(boolean hasStylus) {
        this.hasStylus = hasStylus;
    }

    // Overriding the toString() method
    @Override
    public String toString() {
        return super.toString() + ", Tablet{" +
                "batteryLife=" + batteryLife +
                ", hasStylus=" + hasStylus +
                '}';
    }
}
