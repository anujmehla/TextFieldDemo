package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Separator;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class Main extends Application {

    /*@Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
    }

*/
    TextField tf;
    Label response;
    public void start(Stage myStage)
    {
        myStage.setTitle("Text Field Demo");
        FlowPane rootNode = new FlowPane(10,10);
        rootNode.setAlignment(Pos.CENTER);
        Scene scene =new Scene(rootNode,230,140);
        myStage.setScene(scene);
        response=new Label("Search String ");
        Button btnGetText = new Button("Get Seacrh String");
        tf= new TextField();
        tf.setPromptText("Enter Search String");
        tf.setPrefColumnCount(15);
        tf.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                response.setText("Search String : "+tf.getText());
            }
        });
        btnGetText.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                response.setText("Search String : "+tf.getText());
            }
        });
        Separator separator= new Separator();
        separator.setPrefWidth(300);

        rootNode.getChildren().addAll(tf,btnGetText,separator,response);
        myStage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}
