package com.designpattern.problems;

import java.util.ArrayList;

// Vehicle and its inherited classes.
enum VehicleSize {Motorcycle, Compact, Large}

enum Level {P1, P2, P3}

abstract class Vehicle {
    protected ArrayList<ParkingSpot> parkingSpots = new ArrayList<ParkingSpot>();
    protected String licensePlate;
    protected int spotsNeeded;
    protected VehicleSize size;

    public int getSpotsNeeded() {
        return spotsNeeded;
    }

    public VehicleSize getSize() {
        return size;
    }

    /* Park vehicle in this spot (among others, potentially) */
    public void parkinSpot(ParkingSpot s) {
        parkingSpots.add(s);
    }


    /* Remove vehicle from spot, and notify spot
       that it's gone */
    public void clearSpots() {
        //clear spot
    }

    /* Checks if the spot is big enough for the vehicle (and is available).
       This * compares the SIZE only.It does not check if it has enough spots. */
    public abstract boolean canFitinSpot(ParkingSpot spot);
}

class Bus extends Vehicle {
    public Bus() {
        spotsNeeded = 5;
        size = VehicleSize.Large;
    }

    /* Checks if the spot is a Large. Doesn't check num of spots */
    public boolean canFitinSpot(ParkingSpot spot) {
        return true;
    }
}

class Car extends Vehicle {
    public Car() {
        spotsNeeded = 1;
        size = VehicleSize.Compact;
    }

    /* Checks if the spot is a Compact or a Large. */
    public boolean canFitinSpot(ParkingSpot spot) {
        return true;
    }
}

class Motorcycle extends Vehicle {
    public Motorcycle() {
        spotsNeeded = 1;
        size = VehicleSize.Motorcycle;
    }

    public boolean canFitinSpot(ParkingSpot spot) {
        return true;
    }
}

public class ParkingSpot {
    private Vehicle vehicle;
    private VehicleSize spotSize;
    private int row;
    private int spotNumber;
    private Level level;

    public ParkingSpot(Level lvl, int r, int n, VehicleSize s) {
        this.level = lvl;
        this.row = r;
        this.spotNumber = n;
        this.spotSize = s;
    }

    public boolean isAvailable() {
        return vehicle == null;
    }

    /* Check if the spot is big enough and is available */
    public boolean canFitVehicle(Vehicle vehicle) {
        return true;
    }

    /* Park vehicle in this spot. */
    public boolean park(Vehicle v) {
        //park the vehicle
        return true;
    }

    public int getRow() {
        return row;
    }

    public int getSpotNumber() {
        return spotNumber;
    }

    /* Remove vehicle from spot, and notify level that a new spot is available */
    public void removeVehicle() {
        //remove the vehicle from parkingspot
    }
}
