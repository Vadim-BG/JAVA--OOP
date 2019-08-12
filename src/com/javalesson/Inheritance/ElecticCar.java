package com.javalesson.Inheritance;

public class ElecticCar extends Auto {

    private int batteryVolume;
    private int passengersNumber;

    public ElecticCar(String producer, String model, int batteryVolume, int passengersNumber) {
        super(producer, model, EngineType.ELECTRIC);
        this.batteryVolume = batteryVolume;
        this.passengersNumber = passengersNumber;
    }

    public void charge(){
        System.out.println("Battery is charging");
    }

    public int getBatteryVolume() {
        return batteryVolume;
    }

    public void setBatteryVolume(int batteryVolume) {
        this.batteryVolume = batteryVolume;
    }

    public int getPassengersNumber() {
        return passengersNumber;
    }

    public void setPassengersNumber(int passengersNumber) {
        this.passengersNumber = passengersNumber;
    }
}
