module com.example.schoolmangementsystem {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.ikonli.javafx;

    opens com.example.schoolmangementsystem to javafx.fxml;
    exports com.example.schoolmangementsystem;
}