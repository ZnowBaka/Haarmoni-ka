module com.example.haarmonika {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires net.synedra.validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;
    requires com.almasb.fxgl.all;
    requires java.sql;
    requires java.desktop;

    opens com.example.haarmonika to javafx.fxml;
    exports com.example.haarmonika;
    exports com.example.haarmonika.Model;
    opens com.example.haarmonika.Model to javafx.fxml;
    exports com.example.haarmonika.Controller;
    opens com.example.haarmonika.Controller to javafx.fxml;
    exports com.example.haarmonika.Utilities;
    opens com.example.haarmonika.Utilities to javafx.fxml;
}