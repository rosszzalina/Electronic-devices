package org.example.electronicdevices;



// Smartphone class inherits from Device
public class Smartphone extends Device {
    private double screenSize;
    private double cameraResolution;

    // Constructor
    public Smartphone(String name, double price, double weight, double screenSize, double cameraResolution) {
        super(DeviceType.SMARTPHONE, name, price, weight);
        this.screenSize = screenSize;
        this.cameraResolution = cameraResolution;
    }

    // Getters and Setters
    public double getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(double screenSize) {
        this.screenSize = screenSize;
    }

    public double getCameraResolution() {
        return cameraResolution;
    }

    public void setCameraResolution(double cameraResolution) {
        this.cameraResolution = cameraResolution;
    }

    // Overriding the toString() method
    @Override
    public String toString() {
        return super.toString() + ", Smartphone{" +
                "screenSize=" + screenSize +
                ", cameraResolution=" + cameraResolution +
                '}';
    }
}

