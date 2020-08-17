package design.abstractFactory;

import design.abstractFactory.Food;
import design.abstractFactory.Weapon;

public class Main {
    public static void main(String[] args) {
        AbstractFactory abstractFactory = new ModernFactory();
        Food food = abstractFactory.createFood();
        food.printName();
        Vehicle vehicle = abstractFactory.createVehicle();
        vehicle.go();
        Weapon weapon = abstractFactory.createWeapon();
        weapon.shoot();
    }
}
