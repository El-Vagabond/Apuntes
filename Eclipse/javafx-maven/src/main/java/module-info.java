module com.maf.javafx_maven {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.maf.javafx_maven to javafx.fxml;
    exports com.maf.javafx_maven;
}
