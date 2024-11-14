# Proyecto `eu.andreatt.ejercicioo_dein` (NO FUNCIONA)

## Descripción
Esta aplicación JavaFX muestra una etiqueta de producto utilizando `ProductoLabel.fxml` para la interfaz y `estilos.css` para los estilos visuales.

## Estructura de Archivos
- `ProductoLabel.java`: Clase principal que representa y maneja la etiqueta de producto.
- `css/estilos.css`: Archivo de estilos CSS para la personalización de la interfaz.
- `fxml/ProductoLabel.fxml`: Estructura visual de la etiqueta del producto.
- `images/trigo.png`: Imagen de producto utilizada en la interfaz.
- `module-info.java`: Configuración de módulos.
- `README.md`: Guía para ejecutar el proyecto.

## Requisitos
- Java 11 o superior
- JavaFX configurado en el `module-path`

## Configuración y Ejecución

### Compilación
1. Configura el `module-path` para JavaFX.
2. Compila el proyecto ejecutando:
   ```sh
   javac --module-path /path/to/javafx/lib --add-modules javafx.controls,javafx.fxml -d out src/eu/andreatt/ejercicioo_dein/**/*.
