package StructuralDesignPattern.Composite;

public class Product implements Component{

    private int price ;

    public Product(int price){
        this.price = price;
    }

    @Override
    public int price() {
        return price;
    }
}
