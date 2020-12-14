package CreationalDesignPattern.FactoryMethod;

public class TruckCreator implements Creator {
    @Override
    public Transport createTransport() {
        return new Truck();
    }
}
