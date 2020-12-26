package BehavioralDesignPattern.Observer;

import java.util.ArrayList;
import java.util.List;

public class CentralStore {
    private List<RootComponent> components = new ArrayList<>();

    public void addComponent(RootComponent component){
            this.components.add(component);
    }

    public void removeComponent(RootComponent component){
        this.components.remove(component);
    }

    public void changeState(){
        System.out.println("changing state");
        this.components.forEach(component -> {
            component.updateState(1000);
            component.render();
        });
    }

    public static void main(String[] args) {
        CentralStore centralStore = new CentralStore();
        RootComponent cmp1 = new Component(3);
        cmp1.render();
        RootComponent cmp2 = new Component(4);
        cmp2.render();

        centralStore.addComponent(cmp1);
        centralStore.addComponent(cmp2);

        centralStore.changeState();

    }

}
