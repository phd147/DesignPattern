package CreationalDesignPattern.FactoryMethod.create;

import CreationalDesignPattern.FactoryMethod.transport.Transport;
import CreationalDesignPattern.FactoryMethod.transport.Truck;

public class TruckCreator implements Creator {
    @Override
    public Transport createTransport() {
        return new Truck();
    }
}
