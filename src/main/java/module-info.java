module org.example.electronicdevices {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;

    opens org.example.electronicdevices to javafx.fxml;
    exports org.example.electronicdevices;
}