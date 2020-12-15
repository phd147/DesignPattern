package CreationalDesignPattern.Builder;

public class Builder {
    private int id ;
    private String name ;
    private int speed ;

    public int getId(){
        return this.id ;
    }

    public String getName(){
        return this.name;
    }

    public int getSpeed(){
        return this.speed;
    }




    public Builder addId(int id){
        this.id = id ;
        return this ;
    }

    public Builder addName(String name){
        this.name = name ;
        return this ;
    }

    public Builder addSpeed(int speed){
        this.speed = speed;
        return this ;
    }

    public Car buildCar(){
        return new Car(this);
    }

}
