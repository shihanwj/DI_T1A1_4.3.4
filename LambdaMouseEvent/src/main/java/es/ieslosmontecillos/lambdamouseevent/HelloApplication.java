/**
 * 2º DAM DI
 * Autora: Shihan Wei
 * 4.3.4. Expresiones Lambda. MouseEvent
 */

package es.ieslosmontecillos.lambdamouseevent;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;


public class HelloApplication extends Application {
    @Override
    public void start(Stage primaryStage) {

        Pane root = new Pane();
        /* creamos el objeto texto */
        Text texto = new Text(75, 70, "Programming is fun");
        root.getChildren().add(texto);

        /* este evento mueve el texto hacia donde lo arrastra el raton*/
        texto.setOnMouseDragged(cursor -> {
            texto.setY(cursor.getSceneY());
            texto.setX(cursor.getSceneX());
        });

        Scene scene = new Scene(root, 250, 150);

        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}