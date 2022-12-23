package com.example.tryui2;

public class Tour_guide extends Person {
    private int workinghours;
    private double hourlypay;
    private String help;
    private String city;
    String phoneno;
    private String language;
    private String complaint;

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    private String helpanswer;
    private String complaintreply;
    public int getWorkinghours() {
        return workinghours;
    }

    public Tour_guide(int workinghours, double hourlypay, int requestsno, int completednooftours, boolean accepted,String Username,String Password) {
        this(Username,Password);
        this.workinghours = workinghours;
        this.hourlypay = hourlypay;
        this.requestsno = requestsno;
        this.completednooftours = completednooftours;
        this.accepted = accepted;
    }

    public Tour_guide(String Username, String Password, int workinghours, double hourlypay, int requestsno, int completednooftours, boolean accepted) {
        super(Username, Password);
        this.workinghours = workinghours;
        this.hourlypay = hourlypay;
        this.requestsno = requestsno;
        this.completednooftours = completednooftours;
        this.accepted = accepted;
    }

    public void setWorkinghours(int workinghours) {
        this.workinghours = workinghours;
    }

    public double getHourlypay() {
        return hourlypay;
    }

    public void setHourlypay(double hourlypay) {
        this.hourlypay = hourlypay;
    }

    public String getHelp() {
        return help;
    }

    public void setHelp(String help) {
        this.help = help;
    }

    public String getComplaint() {
        return complaint;
    }

    public void setComplaint(String complaint) {
        this.complaint = complaint;
    }

    public String getHelpanswer() {
        return helpanswer;
    }

    public void setHelpanswer(String helpanswer) {
        this.helpanswer = helpanswer;
    }

    public String getComplaintreply() {
        return complaintreply;
    }

    public void setComplaintreply(String complaintreply) {
        this.complaintreply = complaintreply;
    }
    public int getRequestsno() {
        return requestsno;
    }
    public void setRequestsno(int requestsno) {
        this.requestsno = requestsno;
    }
    public int getCompletednooftours() {
        return completednooftours;
    }
    public void setCompletednooftours(int completednooftours) {
        this.completednooftours = completednooftours;
    }
    public boolean isAccepted() {
        return accepted;
    }
    public void setAccepted(boolean accepted) {
        this.accepted = accepted;
    }
    private int requestsno;
    private int completednooftours;
    private boolean accepted;

    Tour_guide(String Username, String Password){
        super(Username,Password);
    }



}