module FirstProject {
    requires javafx.controls;
    requires javafx.fxml;
    requires kotlin.stdlib;

    opens org.test to javafx.fxml;
    exports org.test;
}