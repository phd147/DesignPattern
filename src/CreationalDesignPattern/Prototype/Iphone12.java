package CreationalDesignPattern.Prototype;

public class Iphone12 extends Iphone implements Prototype {
    private String name ;


    public Iphone12(int id, int price,String name){
        super(id,price);
        this.name = name ;
    }


    public Iphone12(Iphone12 iphone12){
        super(iphone12);
        this.name = iphone12.name ;
    }


    @Override
    public Iphone12 clone() {
        return new Iphone12(this);
    }

    @Override
    public String toString() {
        return "Iphone12{" +
                super.toString()+
                "name='" + name + '\'' +
                '}';
    }
}
