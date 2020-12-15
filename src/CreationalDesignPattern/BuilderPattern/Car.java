package CreationalDesignPattern.BuilderPattern;

public class Car {
    private int id ;
    private String name ;
    private int speed ;

    private  Car(){

    }

    public Car(Builder builder){
        this.id = builder.getId() ;
        this.name = builder.getName() ;
        this.speed = builder.getSpeed() ;
    }

    public static Builder getBuilder(){
        return new Builder();
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", speed=" + speed +
                '}';
    }
}
