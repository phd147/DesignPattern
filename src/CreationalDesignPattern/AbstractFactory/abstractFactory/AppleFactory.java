package CreationalDesignPattern.AbstractFactory.abstractFactory;

import CreationalDesignPattern.AbstractFactory.product.iphone.Iphone;
import CreationalDesignPattern.AbstractFactory.product.macbook.Macbook;

public interface AppleFactory {
    Iphone createIphone();

    Macbook createMacbook();
}
