package com.designpattern.structural;

class FlightBooking {

    public void bookFlight(String pakage, String destination, String departure) {
        System.out.println("Return Trip Filght for: " + destination + " & " + departure + " is booked under package: " + pakage);
    }
}

class HotelBooking {
    public void bookHotel(String pakage, String destination) {
        System.out.println("Hotel booked under package: " + pakage + " at: " + destination);
    }
}

class CabBooking {
    public void bookCab(String pakage) {
        System.out.println("Cab is booked under package: " + pakage);
    }
}

class HolidayBookingFacade {
    private FlightBooking flightBooking;
    private HotelBooking hotelBooking;
    private CabBooking cabBooking;

    public HolidayBookingFacade() {
        this.flightBooking = new FlightBooking();
        this.hotelBooking = new HotelBooking();
        this.cabBooking = new CabBooking();
    }

    public boolean bookHolidayPackage(String pakage, String destination, String departure) {
        flightBooking.bookFlight(pakage, destination, departure);
        hotelBooking.bookHotel(pakage, destination);
        cabBooking.bookCab(pakage);
        return true;
    }
}

public class Facade {
    public static void main(String[] args) {

        HolidayBookingFacade facade = new HolidayBookingFacade();
        String pakge = "Gold";
        String destination = "Mauritius";
        String departure = "Delhi";
        facade.bookHolidayPackage(pakge, destination, departure);
    }
}
