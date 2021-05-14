package ipbeja.pt;/**
 * @author Nuro Séle 20556
 * @version 03/03/2021
 */

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import javax.swing.*;

public class Main3 extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Button button1 = new Button("Button 1");
        Button button2 = new Button("Button 2");

        VBox vBox = new VBox(100, button1, button2);

        ButtonHandler handler = new ButtonHandler();
        button1.setOnAction(handler);
        button2.setOnAction(handler);

        Scene scene = new Scene(vBox);
        primaryStage.setScene(scene);
        primaryStage.show();


    }

     public void meuNome() {
        System.out.println("Hi");
    }

    class ButtonHandler implements EventHandler<ActionEvent>{


        @Override
        public void handle(ActionEvent event) {
        Button sorce = (Button) event.getSource();
        //sorce.getText();//prob

        Alert alert = new Alert(Alert.AlertType.INFORMATION, "Button 1/2");
        alert.show();
        }
    }
}
