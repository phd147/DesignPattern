package CreationalDesignPattern.SingletonPattern;

public class MyCrush {
    private String name ;
    private MyCrush(String name){
        this.name = name ;
    }

    private static MyCrush myCrush;

    public MyCrush getInstance(){
        if(myCrush == null){
            return new MyCrush("Cathh11");
        }
        return myCrush;
    }
}
