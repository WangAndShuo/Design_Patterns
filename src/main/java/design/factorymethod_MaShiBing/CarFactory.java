package design.factorymethod_MaShiBing;


public class CarFactory {

    public Moveable create(){
        System.out.println("a car card");
        return new Car();
    }
}
