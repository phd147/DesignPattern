package StructuralDesignPattern.Adapter;

public class Dev {
    private String country ;

    public Dev(String country){
        this.country = country;
    }

    public void solvingAndCode(){
        System.out.println("noi tieng "+country);
    }
}
