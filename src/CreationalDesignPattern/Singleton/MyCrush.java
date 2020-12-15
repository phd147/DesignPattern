package CreationalDesignPattern.Singleton;

public class MyCrush {
    private String name ;
    private MyCrush(String name){
        this.name = name ;
    }

    public String getName(){return this.name;}

    private static MyCrush myCrush;

    public static MyCrush getInstance(){
        if(myCrush == null){
            return new MyCrush("Cath11");
        }
        return myCrush;
    }
}
