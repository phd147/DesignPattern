package CreationalDesignPattern.AbstractFactory.abstractFactory;

import CreationalDesignPattern.AbstractFactory.product.iphone.Iphone;
import CreationalDesignPattern.AbstractFactory.product.iphone.ProIphone;
import CreationalDesignPattern.AbstractFactory.product.macbook.Macbook;
import CreationalDesignPattern.AbstractFactory.product.macbook.ProMacbook;

public class ProFactory implements AppleFactory{
    @Override
    public Iphone createIphone() {
        return new ProIphone();
    }

    @Override
    public Macbook createMacbook() {
        return new ProMacbook();
    }
}
