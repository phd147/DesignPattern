package CreationalDesignPattern.FactoryMethod;

import CreationalDesignPattern.FactoryMethod.create.Creator;
import CreationalDesignPattern.FactoryMethod.create.ShipCreator;
import CreationalDesignPattern.FactoryMethod.create.TruckCreator;

public class App {
    public static void main(String[] args) {
        Creator ship = new ShipCreator();
        ship.createTransport().shipping();

        Creator truck = new TruckCreator();
        truck.createTransport().shipping();
    }
}
