module com.example.fpasd {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;

    opens com.example.fpasd to javafx.fxml;
    exports com.example.fpasd;
}