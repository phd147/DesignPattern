package StructuralDesignPattern.Composite;

import java.util.List;

public class Box implements Component {



    private List<Component> elements;

    public Box(List<Component> components){
            elements = components;
    }

    @Override
    public int price() {

        int sumPrice = 0 ;
        for(Component el : elements ){
            sumPrice = sumPrice + el.price();
        }
        return sumPrice;
    }
}
