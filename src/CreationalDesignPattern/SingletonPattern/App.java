package CreationalDesignPattern.SingletonPattern;

public class App {
    public static void main(String[] args) {
        MyCrush myCrush = MyCrush.getInstance();
        System.out.println(myCrush.getName());
    }
}
