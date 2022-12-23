package com.example.tryui2;

import java.util.ArrayList;

class ShoppingCart {
    Double Total_price=0.0;
    ArrayList<Booking> items=new ArrayList<Booking>();
    ShoppingCart(){}
    void additem(Booking booking){
        items.add(booking);
        Total_price+=booking.price;
    }
    void deleteitem(Booking booking){
        for(int i = 0; i<items.size();i++){
            if(booking.equals(items.get(i))){
                items.remove(items.get(i));
            }
        }
        Total_price-=booking.price;
    }
    Booking search(Booking booking){
        for(int i = 0; i<items.size();i++){
            if(booking.equals(items.get(i))){
                return items.get(i);
            }
        }
        return null;
    }
}