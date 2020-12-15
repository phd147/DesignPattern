package CreationalDesignPattern.Prototype;

public class App {
    public static void main(String[] args) {
        Iphone iphone = new Iphone(1999,2000);

        Iphone iphoneClone = iphone.clone();
        System.out.println(iphoneClone);



        Iphone12 iphone12 = new Iphone12(2000,4000,"iphone 12222");

        Iphone12 iphone12Clone = iphone12.clone();
        System.out.println(iphone12Clone);

    }
}
