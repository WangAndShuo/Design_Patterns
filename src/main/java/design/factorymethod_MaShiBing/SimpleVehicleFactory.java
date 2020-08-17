package design.factorymethod_MaShiBing;


/***
 * 简单工厂的可拓展性不好，每次加工具都得添加方法
 */
public class SimpleVehicleFactory {
    public Car createCar(){
        //before processing
        return  new Car();
    }

    public Broom createBroom(){

        return new Broom();
    }
}
