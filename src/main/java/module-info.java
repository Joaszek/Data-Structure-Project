module com.example.painter {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.swing;


    opens com.example.painter to javafx.fxml;
    exports com.example.painter;
}