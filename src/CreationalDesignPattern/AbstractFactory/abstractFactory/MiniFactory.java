package CreationalDesignPattern.AbstractFactory.abstractFactory;

import CreationalDesignPattern.AbstractFactory.product.iphone.Iphone;
import CreationalDesignPattern.AbstractFactory.product.iphone.MiniIphone;
import CreationalDesignPattern.AbstractFactory.product.macbook.Macbook;
import CreationalDesignPattern.AbstractFactory.product.macbook.MiniMacbook;

public class MiniFactory implements AppleFactory {
    @Override
    public Iphone createIphone() {
        return new MiniIphone();
    }

    @Override
    public Macbook createMacbook() {
        return new MiniMacbook();
    }
}
