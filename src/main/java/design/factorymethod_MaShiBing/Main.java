package design.factorymethod_MaShiBing;


import design.factorymethod_MaShiBing.CarFactory;

public class Main {

    public static void main(String[] args) {

        Moveable m = new Plane();
        m.go();
        Moveable m1 = new Car();
        m1.go();

        Moveable m2 = new CarFactory().create();


    }
}
