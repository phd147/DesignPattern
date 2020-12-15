package CreationalDesignPattern.FactoryMethod.create;

import CreationalDesignPattern.FactoryMethod.transport.Ship;
import CreationalDesignPattern.FactoryMethod.transport.Transport;

public class ShipCreator implements Creator {
    @Override
    public Transport createTransport() {
        return new Ship();
    }
}
