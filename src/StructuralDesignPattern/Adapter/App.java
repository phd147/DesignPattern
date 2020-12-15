package StructuralDesignPattern.Adapter;

public class App {
    public static void main(String[] args) {
        Customer customer = new Customer("Germany");
        BrSE brSE = new BrSE(customer);
        brSE.speaking();

    }
}
