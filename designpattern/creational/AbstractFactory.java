package com.designpattern.creational;

abstract class Car{
    public abstract void construct();
}
class LuxuryCar extends Car{
    LuxuryCar(){
        construct();
    }
    @Override
    public void construct(){
        System.out.println("Constructing to luxury car");
    }
}
class MicroCar extends Car{
    MicroCar(){
        construct();
    }
    @Override
    public void construct(){
        System.out.println("Constructing to Micro Car ");
    }
}
class MiniCar extends Car{
    MiniCar(){
        construct();
    }

    @Override
    public void construct(){
        System.out.println("Constructing to Mini car");
    }
}

interface CarAbstractFactory {
    public Car buildCar();
}
class LuxuryCarFactory implements CarAbstractFactory{
    @Override
    public Car buildCar(){
        return new LuxuryCar();
    }
}
class MicroCarFactory implements CarAbstractFactory{
    @Override
    public Car buildCar(){
        return new MicroCar();
    }
}
class MiniCarFactory implements CarAbstractFactory{
    @Override
    public Car buildCar(){
        return new MiniCar();
    }
}

class CarFactory{
    public static Car getCar(CarAbstractFactory factory){
        return factory.buildCar();
    }
}
public class AbstractFactory {
    public static void main(String[] args) {
        Car car=CarFactory.getCar(new LuxuryCarFactory());
        Car car1=CarFactory.getCar(new MicroCarFactory());
        Car car2=CarFactory.getCar(new MiniCarFactory());
    }
}

