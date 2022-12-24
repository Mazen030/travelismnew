package com.example.tryui2;

public class Tourist extends Person {
    private ShoppingCart cart;
    private String help;
    private String complaint;
    private String helpanswer;
    private String city;
    private String language;
    private String selectedtourguide;
    private String complaintreply;
    public String getComplaint() {
        return complaint;
    }
    /*void choosetourguide(Program program){
       for(int i=0;i<program.getTour_guides().size();i++){
          if(program.getTour_guides().get(i).getCity().equals(city)&&program.getTour_guides().get(i).getLanguage().equals(language)){
             System.out.println(program.getTour_guides().get(i));
          }
       }
    }*/

    public void setComplaint(String complaint) {
        this.complaint = complaint;
    }
    public void addtoShoppingCart(Booking b){
        cart.additem(b);
    }
    public String getComplaintreply() {
        return complaintreply;
    }

    public void setComplaintreply(String complaintreply) {
        this.complaintreply = complaintreply;
    }


    public String getHelp(){return help;}
    public void setHelp(String H){
        this.help=H;
    }
    public void setHelpAnswer(String Ha){
        this.helpanswer=Ha;
    }
    public String getHelpanswer(){
        return helpanswer;
    }
    public ShoppingCart getcart() {
        return cart;
    }

    public Tourist(String username, String password) {
        super(username,password);
    }

    public void search(Booking booking){
        cart.search(booking);
    }
    public void additem(Booking booking){
        cart.additem(booking);
    }
    public void deleteitem(Booking booking){
        cart.deleteitem(booking);
    }
}