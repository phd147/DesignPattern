package BehavioralDesignPattern.ChainOfResponsibility;

public class App {
    public static void main(String[] args) {
        HandlerI h1 = new HandlerI() {
            @Override
            public void userHandler(Object data, HandlerI next) throws Exception {
                System.out.println("middleware is number");
                if(data instanceof Integer){
                    next.handle(data);
                }else {
                    throw new Exception("not is a number");
                }
            }
        } ;

        HandlerI h2 = new HandlerI() {
            @Override
            public void userHandler(Object data, HandlerI next) throws Exception {
                System.out.println("middleware is greater than 10");
                if((Integer)data > 10){
                    next.handle(data);
                }else {
                    throw new Exception("not greater than 10") ;
                }
            }
        };

        HandlerI h3 = new HandlerI() {
            @Override
            public void userHandler(Object data, HandlerI next) throws Exception {
                System.out.println("middleware is so chan ");
                if((Integer) data %2 == 0){
                    System.out.println("okk da qua het middleware , ahiahi");
                }else {
                    throw new Exception("not so chan");
                }
            }
        };

        h1.setNext(h2);
        h2.setNext(h3);

        try {
            h1.handle(20);
        }
        catch(Exception e){
            e.printStackTrace();
        }


    }
}
