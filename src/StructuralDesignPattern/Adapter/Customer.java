package StructuralDesignPattern.Adapter;

public class Customer {

    private String country ;

    public Customer(){

    }


    public Customer(String country){
        this.country = country;
    }



    public void speaking(){
        System.out.println(country);
    }

    public String getCountry() {
        return country;
    }
}
