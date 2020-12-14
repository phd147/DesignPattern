package CreationalDesignPattern.FactoryMethod;

public class ShipCreator implements Creator {
    @Override
    public Transport createTransport() {
        return new Ship();
    }
}
