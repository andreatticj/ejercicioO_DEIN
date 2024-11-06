module eu.andreatt.ejercicioo_dein {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;

    exports eu.andreatt.ejercicioo_dein;
    opens eu.andreatt.ejercicioo_dein to javafx.fxml;
}
