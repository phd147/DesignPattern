package BehavioralDesignPattern.ChainOfResponsibility;

public class HandlerC extends HandlerI{

    HandlerI next ;

    public void  setNext(HandlerI next){
        this.next = next ;
    }

    public void userHandler(Object data , HandlerI next) {

    }

    public  void handle(Object data){
        this.userHandler(data , this.next);
    }

}
