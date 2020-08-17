package design.factorymethod_MaShiBing;

import design.factorymethod_MaShiBing.Moveable;

public class Plane implements Moveable {

    @Override
    public void go(){
        System.out.println("plane fly");
    }

}
