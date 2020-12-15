package CreationalDesignPattern.FactoryMethod.transport;

public class Ship implements Transport {
    @Override
    public void shipping() {
        System.out.println("Ship is shipping");
    }
}
