package CreationalDesignPattern.FactoryMethod;

public class Truck implements Transport {
    @Override
    public void shipping() {
        System.out.println("Trucking is shipping");
    }
}
