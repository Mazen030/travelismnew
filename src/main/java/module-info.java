module com.example.tryui2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.tryui2 to javafx.fxml;
    exports com.example.tryui2;
}