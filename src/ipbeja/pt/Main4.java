package ipbeja.pt;/**
 * @author Nuro Séle 20556
 * @version 03/03/2021
 */

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main4 extends Application {


    private Button button1;
    private Button button2;

    private int counter1 = 0;
    private int counter2 = 0;
    private Label label1;
    private Label label2;


    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        Buttonhandler buttonhandler = new Buttonhandler();

        this.button1 = new Button("Button 1");
        button1.setOnAction(buttonhandler);
        label1 = new Label("0");

        HBox top = new HBox(50, button1, label1);

        this.button2 = new Button("Button 2");
        button2.setOnAction(buttonhandler);
        label2 = new Label("0");

        HBox top1 = new HBox(50, button2, label2);

        VBox box = new VBox(50, top, button1);

        Scene scene = new Scene(box);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    class Buttonhandler implements EventHandler<ActionEvent>{
        public void handle(ActionEvent event){
         Button button = (Button) event.getSource();

            if(button == button1){
                //int value = Integer.parseInt(label2.getText()) + 1;
                //label1.setText(value + "");
                counter1++;
                label1.setText(counter1 + "");
            }else{
                label2.setText(String.valueOf(++counter2));
            }
        }

    }
}
