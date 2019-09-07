package com.designpattern.creational;

abstract class Vehicle{
    public abstract void printVehicle();
}
class TwoWheeler extends Vehicle{
    public  void printVehicle(){
        System.out.println("I am two wheeler");
    }
}
class FourWheeler extends Vehicle{
    public  void printVehicle(){
        System.out.println("I am four wheeler");
    }
}
class VehicleFactory{
    public static Vehicle getVehicle(int type){
        if(type==1){
            return new TwoWheeler();
        }else if(type==2){
            return new FourWheeler();
        }
        return null;
    }
}
public class Factory {
    public static void main(String[] args) {
        Vehicle vehicle=VehicleFactory.getVehicle(1);
        vehicle.printVehicle();
        Vehicle vehicle1=VehicleFactory.getVehicle(2);
        vehicle1.printVehicle();
    }
}

