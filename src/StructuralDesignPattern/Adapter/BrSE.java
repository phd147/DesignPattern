package StructuralDesignPattern.Adapter;

public class BrSE extends Customer {

    // BrSE nay rat trau bo , co the noi duoc nhieu thu tieng

    private Dev dev ;

    public BrSE(Customer customer){
        super();
        this.dev = new Dev(customer.getCountry());
    }

    @Override
    public void speaking() {
        dev.solvingAndCode();
    }
}
