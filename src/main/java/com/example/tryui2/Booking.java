package com.example.tryui2;

public abstract class Booking {
    protected double price=0.0;
    protected String description;
    public boolean equals(Booking booking){
        if(booking.description.equals(this.description)){
            return true;
        }
        else
        {return false;}
    }
    public double getPrice(){
        return price;
    }
    public void setPrice(double price){
        this.price=price;
    }
}