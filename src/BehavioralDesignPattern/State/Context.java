package BehavioralDesignPattern.State;

public class Context {
    private StateInterface state ;

    public void changeState(StateInterface state){
        this.state = state;
    }

    public void execute(){
        this.state.execute();
    }

    public static void main(String[] args) {
        Context context = new Context();

        context.changeState(() -> System.out.println("hello"));
        context.execute();

        context.changeState(() -> System.out.println("sdfsdfsdf"));
        context.execute();

    }
}
