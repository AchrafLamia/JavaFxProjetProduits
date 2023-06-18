package ma.enset.jpjdbc.presentation.view;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class ApplicationJavaFx extends Application {
    public static void main(String[] args){ launch(args);}

    @Override
    public void start(Stage primaryStage) throws Exception {
      BorderPane root=FXMLLoader.load(getClass().getResource("produitsView.fxml"));
        Scene scene = new Scene(root, 640, 480);
        primaryStage.setTitle("Hello!");
        primaryStage.setScene(scene);
       primaryStage.show();
    }
}
