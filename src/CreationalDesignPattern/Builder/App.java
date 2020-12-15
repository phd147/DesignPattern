package CreationalDesignPattern.Builder;

public class App {
    public static void main(String[] args) {
        Car myCar = Car.getBuilder().addSpeed(400).addId(69).addName("Lamborghini").buildCar();
        System.out.println(myCar);
    }
}
