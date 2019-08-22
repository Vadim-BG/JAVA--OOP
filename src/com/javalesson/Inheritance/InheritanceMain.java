package com.javalesson.Inheritance;

public class InheritanceMain {
    public static void main(String[] args) {

        Engine truckEngine = new Engine(6.0, EngineType.DIESEL, 900);
        Engine busEngine = new Engine(3.5, EngineType.DIESEL, 150);
        Auto bus = new Bus("Mercedes", "Sprinter", busEngine, 30, 75, 12);
        Auto truck = new Truck("Volvo", "VNL 300", truckEngine, 300, 500, 1000);
        Auto car = new ElecticCar("Tesla", "Model S", 100500, 4);
        Auto auto = new Auto("WV","Polo",busEngine);


        runCar(bus);
        runCar(truck);
        runCar(car);
        runCar(auto);

    }

    private static void runCar(Auto auto){

        auto.start();
        auto.stop();
        if (auto instanceof FuelAuto){
            FuelAuto fAuto = (FuelAuto) auto;
            fAuto.fuelUp(50);
        }

    }
}
