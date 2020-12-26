package BehavioralDesignPattern.Observer;

public class Component implements RootComponent{

    int state ;

    public Component(int state){
        this.state= state ;
    }



    @Override
    public void updateState( int state) {
        this.state = state ;
    }

    @Override
    public void render() {
        System.out.println("state is changing to "+this.state);
    }
}
