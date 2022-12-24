package com.example.tryui2;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Paint;
import javafx.stage.Stage;

import java.io.FileInputStream;
import java.util.ArrayList;

public class HelloController {
    @FXML
    private Button hotel;
    //private static ArrayList<Hotel> Hotels=new ArrayList<Hotel>();
@FXML
private Button flight;
@FXML
private Button tourguide;
@FXML
private Button activities;
@FXML
private Image image;
@FXML
private Button login;
@FXML
private TextField username;
@FXML
private PasswordField password;
@FXML
private Button Homepage;
    @FXML
    private Button Homepage2;
    @FXML
    private Button Homepage3;
    @FXML
    private Button Homepage4;
    @FXML
    private Button confirmbooking;
    @FXML
    private Button confirmflight;
    @FXML
    private Button print;
    @FXML
    private Label outputhotel;
    @FXML
    private TextField countryinhotel;
    @FXML
    private Button addreq;
    @FXML
    private TextField destcity;
    @FXML
    private Button addreqf;
    @FXML
    private Label outputflight;
    @FXML
    private Button confirmpayment;
    @FXML
    private Label messagesuccesful;
    @FXML
    private Label totalprice;
    @FXML
    private Label cart;
    @FXML
    private Label loginmessage;
    
    @FXML
    void gonext0(MouseEvent event) throws Exception {
        Stage stage=(Stage) login.getScene().getWindow();
        if(username.getText().toString().equals("mazen") && password.getText().toString().equals("123") ){
        Parent root = FXMLLoader.load(getClass().getResource("hello-view.fxml"));

        stage.setScene(new Scene(root));
        stage.show();
    }}

    @FXML
    void gonext(MouseEvent event) throws Exception {
        Stage stage=(Stage) hotel.getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource("hotelview.fxml"));

        stage.setScene(new Scene(root));
stage.show();
    }
    @FXML
    void gonext2(MouseEvent event) throws Exception {
        Stage stage=(Stage) flight.getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource("flightview.fxml"));

        stage.setScene(new Scene(root));
        stage.show();
    }
    @FXML
    void gonext3(MouseEvent event) throws Exception {
        Stage stage=(Stage) tourguide.getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource("tourguideview.fxml"));

        stage.setScene(new Scene(root));
        stage.show();
    }
    @FXML
    void gonext4(MouseEvent event) throws Exception {
        Stage stage=(Stage) activities.getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource("activitiesview.fxml"));

        stage.setScene(new Scene(root));
        stage.show();

    }
@FXML
    void gohome(MouseEvent event)throws Exception{
    Stage stage=(Stage) Homepage.getScene().getWindow();
    Parent root = FXMLLoader.load(getClass().getResource("hello-view.fxml"));

    stage.setScene(new Scene(root));
    stage.show();


}
@FXML
    void gohome2(MouseEvent event)throws Exception{
    Stage stage=(Stage) Homepage2.getScene().getWindow();
    Parent root = FXMLLoader.load(getClass().getResource("hello-view.fxml"));

    stage.setScene(new Scene(root));
    stage.show();


}
@FXML
void gohome3(MouseEvent event)throws Exception {
        Stage stage = (Stage) Homepage3.getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource("hello-view.fxml"));

        stage.setScene(new Scene(root));
        stage.show();
    }

    @FXML
    void gohome4(MouseEvent event)throws Exception {
        Stage stage = (Stage) Homepage4.getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource("hello-view.fxml"));

        stage.setScene(new Scene(root));
        stage.show();
    }
    @FXML
    void confirmbookingh(MouseEvent event)throws Exception {
        Stage stage = (Stage) confirmbooking.getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource("hello-view.fxml"));

        stage.setScene(new Scene(root));
        stage.show();
    }
    @FXML
    void confirmbookingf(MouseEvent event)throws Exception {
        Stage stage = (Stage) confirmflight.getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource("hello-view.fxml"));

        stage.setScene(new Scene(root));
        stage.show();
    }
@FXML
    public void printarraylist(MouseEvent event) throws Exception {

        String s = "";

        for (int i = 0; i < Program.getHotels().size(); i++) {
         s+=Program.getHotels().get(i).toString()+"\n";
        }
         outputhotel.setText(s);
        outputhotel.setTextFill(Paint.valueOf("Red"));
        }
    @FXML
        public void showreq(MouseEvent event) throws Exception {
       String c=countryinhotel.getText();
        String p="";
        for(int i=0;i<Program.getHotels().size();i++){

         if(c.equals(Program.getHotels().get(i).getCity())){
             p+=Program.getHotels().get(i).toString()+"\n";

         }



        }

         outputhotel.setText(p);
         outputhotel.setTextFill(Paint.valueOf("Black"));

    }

    @FXML
    public void showreqf(MouseEvent event) throws Exception {
        String c1=destcity.getText();
        String pf="";
        for(int i=0;i<Program.getFlights().size();i++){

            if(c1.equals(Program.getFlights().get(i).getArriving_Airport())){
                pf+=Program.getFlights().get(i).toString()+"\n";
            }

        }

        outputflight.setText(pf);
        outputflight.setTextFill(Paint.valueOf("Black"));

    }
    @FXML
    public void showCart(MouseEvent event){
       // String psh=Program.



    }



}