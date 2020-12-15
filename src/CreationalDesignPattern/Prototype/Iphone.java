package CreationalDesignPattern.Prototype;

public class Iphone implements Prototype{
    protected int id ;
    protected int price ;

    public Iphone(int id, int price){
        this.id = id ;
        this.price = price;
    }

    public Iphone(Iphone iphone){
        this.id = iphone.id ;
        this.price = iphone.price;
    }

    @Override
    public Iphone clone() {
        return new Iphone(this);
    }


    @Override
    public String toString() {
        return "Iphone{" +
                "id='" + id + '\'' +
                ", price=" + price +
                '}';
    }
}
