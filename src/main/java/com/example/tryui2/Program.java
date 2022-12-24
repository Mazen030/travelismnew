package com.example.tryui2;

import java.util.ArrayList;
import java.util.Scanner;

public final class Program {
    Scanner sc=new Scanner(System.in);
    private static ArrayList<Employee> employees=new ArrayList<Employee>();
    private static ArrayList<Tourist> tourists=new ArrayList<Tourist>();
    private static ArrayList<Tour_guide> tour_guides= new ArrayList<Tour_guide>();

    public static ArrayList<Flight> getFlights() {
        return Flights;
    }
//    public static ArrayList<Tourist> getTourists() {
//        return tourists;
//    }
    public static ArrayList<Hotel> getHotels() {
        return Hotels;
    }
    private static ArrayList<Hotel>Hotels=new ArrayList<Hotel>();
    private static ArrayList<Flight>Flights=new ArrayList<Flight>();
    public static void addHotel(Hotel h){
        Hotels.add(h);
    }
    public static void addFlight(Flight f){
        Flights.add(f);
    }
    public ArrayList<Employee> getEmployees() {
        return employees;
    }

    public static ArrayList<Tourist> getTourists() {
        return tourists;
    }

    public ArrayList<Tour_guide> getTour_guides() {
        return tour_guides;
    }
    /*for(int i=0;i< tourists.size();i++){
    if(text1.getText().toString().equals(tourists.get(i).getUsername()) && text2.getText().toString().equals(tourists.get(i).getPassword()) ){
        result.setText("login success");
        x=true;
    user1.changeScene("afterlogin"); // as tourist
    break;
    }
    }
    for(int i=0;i<employees.size();i++){
        if(text1.getText().toString().equals(employees.get(i).getUsername()) && text2.getText().toString().equals(employees.get(i).getPassword()) ){
            result.setText("login success");
            x=true;
            user1.changeScene("afterlogin"); // as tourist

            break;
        }
    }
    for(int i=0;i<tour_guides.size();i++){
        if(text1.getText().toString().equals(tour_guides.get(i).getUsername()) && text2.getText().toString().equals(tour_guides.get(i).getPassword()) ){
            result.setText("login success");
            x=true;
            user1.changeScene("afterlogin"); // as tourist
            break;
        }
    }
    */
    Person check(String username, String password){
        Tourist tourist=new Tourist(username, password);
        for(int i=0;i<tourists.size();i++){
            if(tourist.getUsername().equals(tourists.get(i).getUsername())&&tourist.getPassword().equals(tourists.get(i).getPassword()))
                return tourist;
        }
        Employee emp=new Employee(username, password);
        for(int i=0;i<employees.size();i++){
            if(emp.getUsername().equals(employees.get(i).getUsername())&&emp.getPassword().equals(employees.get(i).getPassword()))
                return emp;
        }
        Tour_guide tg=new Tour_guide(username, password);
        for(int i=0;i<tour_guides.size();i++){
            if(tg.getUsername().equals(tour_guides.get(i).getUsername())&&tg.getPassword().equals(tour_guides.get(i).getPassword()))
                return emp;
        }
        return null;
    }
    boolean checkb(String username, String password){
        Tourist tourist=new Tourist(username, password);
        for(int i=0;i<tourists.size();i++){
            if(tourist.getUsername().equals(tourists.get(i).getUsername())&&tourist.getPassword().equals(tourists.get(i).getPassword()))
                return true;
        }
        Employee emp=new Employee(username, password);
        for(int i=0;i<employees.size();i++){
            if(emp.getUsername().equals(employees.get(i).getUsername())&&emp.getPassword().equals(employees.get(i).getPassword()))
                return true;
        }
        Tour_guide tg=new Tour_guide(username, password);
        for(int i=0;i<tour_guides.size();i++){
            if(tg.getUsername().equals(tour_guides.get(i).getUsername())&&tg.getPassword().equals(tour_guides.get(i).getPassword()))
                return true;
        }
        return false;
    }
    static void addPerson(Person p){
        if(p instanceof Tourist){
            tourists.add((Tourist) p);
        }
        else if(p instanceof Tour_guide){
            tour_guides.add((Tour_guide) p);
        }
        else {employees.add((Employee) p);}
    }

}