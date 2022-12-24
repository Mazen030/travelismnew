package com.example.tryui2;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.LocalDate;
import java.util.Date;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {


//Loading image from URL
//Image image = new Image(new FileInputStream("url for the image));

        Parent root = FXMLLoader.load(getClass().getResource("login.fxml"));

        Scene scene = new Scene(root, 320, 240);

        stage.setTitle("Travellism");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {

        Tourist mazen=new Tourist("mazen","123");
        Program.addPerson(mazen);
        Tourist welson=new Tourist("welson","123");
        Program.addPerson(welson);
        Employee ahmed=new Employee("ahmed","123");
        Program.addPerson(ahmed);
        Tour_guide gamal=new Tour_guide("gamal","456");
        Program.addPerson(gamal);
        Hotel Tulip=new Hotel("Tulip","2022-10-23","2022-11-15",125,"A",false,"Cairo","Spa and Gym","TV","02 56724","5th Settlement",200);
        Hotel LaDemeureMontaigne=new Hotel("La DemeureMontaigne","2022-10-23","2022-11-15",125,"A",false,"paris","Spa and Gym","TV","09 56724","Rue Clément Marot, 8th arr.",3000);
        Hotel Hiltongarden=new Hotel("hiltongarden","2022-10-23","2022-11-15",125,"A",false,"new york","Spa and Gym","comfort bed","02 56724","West 54th Street",2500);
        Hotel Centeralpark=new Hotel("centeralpark","2022-10-23","2022-11-15",200,"B",false,"Lo ndon","VIP Shopping at Local Merchants","doublex room","02 56724","Queensborough Terrace, Westminster Borough",3500);
        Hotel ToggleSuidobashi = new Hotel ("ToggleSuidobashi" , "2022-10-23" , "2022-11-15", 150 , "A" , false , "tokyo" , "Football , SPA , Gym " , "triple room " , "02 74586" , "3 Chome-11-4 Iidabashi, Chiyoda City, Tokyo 102-0072, Japan",4000  );
        Hotel ParamountDubai = new Hotel("ParamountDubai","2022-10-23","2022-11-15",200,"B",false,"London","VIP Shopping at Local Merchants","doublex room","02 56724","Marasi Drive,Dubai",5000);
        Hotel AzraSultan  = new Hotel("AzraSultan","2022-10-23","2022-11-15",200,"B",false,"istanbul","VIP Shopping at Local Merchants","doublex room","02 56724","Alemdar Mahallesi Çatalçeşme sokak no 23, Fatih",1500);
        Flight Egyptair9741=new Flight(LocalDate.of(2022,11,13),"9741","economy","heathrow airport","cairo airport",false,"Egyptair",500);
        Flight Britishairways8921=new Flight(LocalDate.of(2022,12,13),"8921","first","cairo airport","heathrow airport",false,"britsh airways",1000);
        Flight airfrance2648 =new Flight(LocalDate.of(2022,12,13),"2648","first","heathrow airport","charle de gaulle  airport",false,"airfrance airways",750);
        Flight JapanAirlines4587=new Flight(LocalDate.of(2022,12,13),"4587","Business","charle de gaulle airport","Tokyo airport",false,"JapanAirlines4587 airways",3000);
        Flight FlyEmirates2548 =new Flight(LocalDate.of(2022,12,13),"2548","first","Tokyo airport","Dubai airport",false,"FlyEmirates airways",1500);
        Flight AmericanAirlines3654 =new Flight(LocalDate.of(2022,12,13),"3654","first","cairo airport","JohnFKennedy airport",false,"American airways",3000);
        Flight TurkishAir4568 =new Flight(LocalDate.of(2022,12,13),"4568","Economy","Dubai airport","ataturk airport",false,"Turkish airways",2000);

        ahmed.addHotel(Tulip);
        ahmed.addHotel(LaDemeureMontaigne);
        ahmed.addHotel(Hiltongarden);
        ahmed.addHotel(Centeralpark);
        ahmed.addHotel(ToggleSuidobashi);
        ahmed.addHotel(ParamountDubai);
        ahmed.addHotel(AzraSultan);
        ahmed.addFlight(Egyptair9741);
        ahmed.addFlight(Britishairways8921);
        ahmed.addFlight(airfrance2648);
        ahmed.addFlight(JapanAirlines4587);
        ahmed.addFlight(FlyEmirates2548);
        ahmed.addFlight(AmericanAirlines3654);
        ahmed.addFlight(TurkishAir4568);
        launch();
    }




}