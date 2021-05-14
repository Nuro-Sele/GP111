/**
 * @author Nuro Séle 20556
 * @version 03/03/2021
 */

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.awt.*;

public class Main1 extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Label label = new Label("Hello World!");
        label.setAlignment(Pos.CENTER);
        Scene scene = new Scene(label, 200,100);

        primaryStage.setScene(scene);
        primaryStage.show();

    }
}
