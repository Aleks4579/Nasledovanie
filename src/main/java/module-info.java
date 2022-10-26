module com.example.nasledovanie {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.nasledovanie to javafx.fxml;
    exports com.example.nasledovanie;
}