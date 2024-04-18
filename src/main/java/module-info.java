module com.example.javafxlabs {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.example.javafxlabs to javafx.fxml;
    exports com.example.javafxlabs;
}