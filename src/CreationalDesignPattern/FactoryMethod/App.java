package CreationalDesignPattern.FactoryMethod;

public class App {
    public static void main(String[] args) {
        Creator ship = new ShipCreator();
        ship.createTransport().shipping();

        Creator truck = new TruckCreator();
        truck.createTransport().shipping();
    }
}
