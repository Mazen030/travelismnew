package com.example.tryui2;

import java.time.LocalDate;

public class Flight extends Booking {
    private LocalDate Departure_Date;
    private String aClass;
    private String Departure_Airport;
    private String Arriving_Airport;
    private boolean booked;
    private String airline;
    public Flight(LocalDate departure_Date, String flightno, String aClass, String departure_Airport, String arriving_Airport, boolean booked, String airline,double price) {
        Departure_Date = departure_Date;
        Flightno = flightno;
        this.aClass = aClass;
        Departure_Airport = departure_Airport;
        Arriving_Airport = arriving_Airport;
        this.booked = booked;
        this.airline = airline;
        this.price=price;
    }
    @Override
    public String toString(){
        return "Flight No.: "+getFlightno()+"  "+"Airline: "+getAirline()+"   "+"Depature Date: "+ getDeparture_Date().toString()+"   "+"Departure Airport: "+getDeparture_Airport()+"   "+"Arrival Airport: "+getArriving_Airport()+"Price:"+getPrice()+'\n';
    }
    private String Flightno;

    public LocalDate getDeparture_Date() {
        return Departure_Date;
    }

    public void setDeparture_Date(LocalDate departure_Date) {
        Departure_Date = departure_Date;
    }


    public String getFlightno() {
        return Flightno;
    }

    public void setFlightno(String flightno) {
        this.Flightno = flightno;
    }
    public String getAclass()
    {
        return aClass;
    }

    public void setClass(String aClass) {
        this.aClass = aClass;
    }

    public String getDeparture_Airport() {
        return Departure_Airport;
    }

    public void setDeparture_Airport(String departure_Airport) {
        Departure_Airport = departure_Airport;
    }

    public String getArriving_Airport() {
        return Arriving_Airport;
    }

    public void setArriving_Airport(String arriving_Airport) {
        this.Arriving_Airport = arriving_Airport;
    }

    public boolean isBooked() {
        return booked;
    }

    public void setBooked(boolean booked) {
        this.booked = booked;
    }

    public String getAirline() {
        return airline;
    }

    public void setAirline(String airline) {
        this.airline = airline;
    }


}