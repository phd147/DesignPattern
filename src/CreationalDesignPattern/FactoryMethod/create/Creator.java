package CreationalDesignPattern.FactoryMethod.create;

import CreationalDesignPattern.FactoryMethod.transport.Transport;

public interface Creator {
    Transport createTransport();

}
