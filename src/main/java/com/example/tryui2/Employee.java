package com.example.tryui2;

import java.util.Scanner;

public class Employee extends Person {

    Scanner sc=new Scanner(System.in);
    //private int tourguideApplied;
    private int bookingRequests;
    private String complains;

//    public int getTourguideApplied() {
    //      return tourguideApplied;
    //}

//    public Employee(int tourguideApplied) {
    //      this.tourguideApplied = tourguideApplied;
    //}

    public Employee(String Username, String Password) {
        super(Username, Password);
        //  this.tourguideApplied = tourguideApplied;
    }
    public void addHotel(Hotel h){
        Program.addHotel(h);
    }
    public void addFlight(Flight f){
        Program.addFlight(f);
    }
    public void showHelpwithtourists(Program program){
        for(int i=0;i<program.getTourists().size();i++){
            if(program.getTourists().get(i).getHelp().isEmpty()!=true)
                System.out.println(program.getTourists().get(i).getHelp());
            System.out.println("Enter answer to help tourist: ");
            program.getTourists().get(i).setHelpAnswer(sc.nextLine());
        }
    }
    public void showcomplaintswithtourists(Program program){
        for(int i=0;i<program.getTourists().size();i++){
            if(program.getTourists().get(i).getComplaint().isEmpty()!=true)
                System.out.println(program.getTourists().get(i).getComplaint());
            System.out.println("Enter reply to tourist: ");
            program.getTourists().get(i).setComplaintreply(sc.nextLine());
        }
    }
    public void showHelpwithtourguides(Program program){
        for(int i=0;i<program.getTour_guides().size();i++){
            if(program.getTour_guides().get(i).getHelp().isEmpty()!=true)
                System.out.println(program.getTour_guides().get(i).getHelp());
            System.out.println("Enter answer to help tour guide: ");
            program.getTour_guides().get(i).setHelpanswer(sc.nextLine());
        }
    }
    public void showcomplaintswithtourguide(Program program){
        for(int i=0;i<program.getTourists().size();i++){
            if(program.getTour_guides().get(i).getComplaint().isEmpty()!=true)
                System.out.println(program.getTour_guides().get(i).getComplaint());
            System.out.println("Enter reply to tour guide: ");
            program.getTourists().get(i).setComplaintreply(sc.nextLine());
        }
    }
    public void showtourguiderequests(Program program){
        for(int i=0;i<program.getTour_guides().size();i++){
            if(program.getTour_guides().get(i).isAccepted()==false){
                System.out.println(program.getTour_guides().get(i).getUsername());
                System.out.println("Do you accept this tourguide?");
                String s= sc.nextLine();
                if(s=="yes"){
                    program.getTour_guides().get(i).setAccepted(true);
                }
            }
        }
    }


}