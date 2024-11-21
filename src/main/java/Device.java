package org.example.electronicdevices;

public abstract class Device {
    // Enum for device types
    public enum DeviceType {
        SMARTPHONE, LAPTOP, TABLET
    }

    // Attributes
    private DeviceType type;
    private String name;
    private double price;
    private double weight;

    // Constructor
    public Device(DeviceType type, String name, double price, double weight) {
        this.type = type;
        this.name = name;
        this.price = price;
        this.weight = weight;
    }

    // Getters and Setters
    public DeviceType getType() {
        return type;
    }

    public void setType(DeviceType type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    // Overriding toString method for displaying device details
    @Override
    public String toString() {
        return "Device{" +
                "type=" + type +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", weight=" + weight +
                '}';
    }
}
