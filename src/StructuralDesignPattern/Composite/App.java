package StructuralDesignPattern.Composite;

import java.util.List;

public class App {
    public static void main(String[] args) {
        Component product1 = new Product(400);
        Component product2 = new Product(900);
        Component product3 = new Product(600);
        Component product4 = new Product(324);
        Component product5 = new Product(666);



        Component box1 = new Box(List.of(product1,product2));
        Component box2 = new Box(List.of(product4,box1));
        Component box3 = new Box(List.of(product3,product5));





        Component root = new Box(List.of(box2,product2,box3));

        System.out.println(root.price());
    }
}
