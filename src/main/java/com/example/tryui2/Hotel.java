package com.example.tryui2;


import java.time.LocalDate;
import java.util.Date;

public class Hotel extends Booking {
    protected LocalDate checkout;
    protected LocalDate checkin;
    protected int guestno;
    private String hotelName;

    public String gethotelName() {
        return hotelName;
    }

    public Hotel(String hotelName,String checkout, String checkin, int guestno, String guestcategory, boolean booked, String city, String amenities, String roomfeatures, String hotelno, String hoteladdress,double price) {
        this.checkout = LocalDate.parse(checkout);
        this.checkin = LocalDate.parse(checkin);
        this.guestno = guestno;
        this.guestcategory = guestcategory;
        this.booked = booked;
        this.city = city;
        this.amenities = amenities;
        this.roomfeatures = roomfeatures;
        this.hotelno = hotelno;
        this.hoteladdress = hoteladdress;
        this.hotelName=hotelName;
        this.price=price;
    }
    @Override
    public String toString(){
        return "Name: "+gethotelName()+"  "+"Category: "+getGuestcategory()+"   "+"City: "+ getCity()+"  "+"Telephone: "+getHotelno()+"Price:"+getPrice()+"\n";
    }
    protected String guestcategory;

    public LocalDate getCheckout() {
        return checkout;
    }

    public void setCheckout(LocalDate checkout) {
        this.checkout = checkout;
    }

    public LocalDate getCheckin() {
        return checkin;
    }

    public void setCheckin(LocalDate checkin) {
        this.checkin = checkin;
    }

    public int getGuestno() {
        return guestno;
    }

    public void setGuestno(int guestno) {
        this.guestno = guestno;
    }

    public String getGuestcategory() {
        return guestcategory;
    }

    public void setGuestcategory(String guestcategory) {
        this.guestcategory = guestcategory;
    }

    public boolean isBooked() {
        return booked;
    }

    public void setBooked(boolean booked) {
        this.booked = booked;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAmenities() {
        return amenities;
    }

    public void setAmenities(String amenities) {
        this.amenities = amenities;
    }

    public String getRoomfeatures() {
        return roomfeatures;
    }

    public void setRoomfeatures(String roomfeatures) {
        this.roomfeatures = roomfeatures;
    }

    public String getHotelno() {
        return hotelno;
    }

    public void setHotelno(String hotelno) {
        this.hotelno = hotelno;
    }

    public String getHoteladdress() {
        return hoteladdress;
    }

    public void setHoteladdress(String hoteladdress) {
        this.hoteladdress = hoteladdress;
    }

    private boolean booked;
    private String city;
    private String amenities;
    private String roomfeatures;
    private String hotelno;
    private String hoteladdress;


}