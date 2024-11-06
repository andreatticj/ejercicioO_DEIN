package eu.andreatt.ejercicioo_dein.application;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;

public class ProductoLabel extends GridPane {
    @FXML
    protected Label labelProducto;
    @FXML
    protected Label labelCantidad;
    @FXML
    private ImageView imageView;

    public ProductoLabel() {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/eu/andreatt/ejercicioo_dein/fxml/ProductoLabel.fxml"));
        fxmlLoader.setRoot(this);
        fxmlLoader.setController(this);
        try {
            fxmlLoader.load();
        } catch (IOException exception) {
            throw new RuntimeException(exception);
        }
    }

    public void setStock(double cantidad) {
        String style;
        if (cantidad > 100) {
            style = "verde";
        } else if (cantidad > 20) {
            style = "azul";
        } else {
            style = "rojo";
        }
        labelCantidad.setText(cantidad + "");
        this.getStyleClass().clear();
        this.getStyleClass().add(style);
    }

    public void setImage(Image imagen) {
        imageView.setImage(imagen);
    }

    public void setName(String nombre) {
        labelProducto.setText(nombre + "");
    }
    @FXML
    private void initialize() {
        // Aquí puedes agregar lógica de inicialización
    }

}