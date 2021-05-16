package BehavioralDesignPattern.ChainOfResponsibility;

public abstract class HandlerI {

    HandlerI next ;

    public abstract void userHandler(Object data, HandlerI next) throws Exception;

    public void setNext(HandlerI next){
        this.next = next;
    }

    public void handle(Object data) throws Exception {
        this.userHandler(data , this.next);
    }
}
