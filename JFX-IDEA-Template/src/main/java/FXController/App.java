package FXController;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.awt.*;

/**
 * Created by Indi on 1/26/2016.
 */
public class App extends Application {
    public static Stage theStage ;
    public static Parent root;

    double x, y;

    private void addDragListeners(final Node n, Stage primaryStage){

        n.setOnMousePressed((MouseEvent mouseEvent) -> {
            this.x = n.getScene().getWindow().getX() - mouseEvent.getScreenX();
            this.y = n.getScene().getWindow().getY() - mouseEvent.getScreenY();
        });

        n.setOnMouseDragged((MouseEvent mouseEvent) -> {
            primaryStage.setX(mouseEvent.getScreenX() + this.x);
            primaryStage.setY(mouseEvent.getScreenY() + this.y);
        });
    }

    //starts the Application window
    @Override
    public void start(Stage primaryStage) throws Exception{
        theStage = primaryStage;
        theStage.initStyle(StageStyle.UNDECORATED);
        root = FXMLLoader.load(getClass().getResource("/FXML/App/ApplicationMenuWindow.fxml"));
        theStage.setTitle("Welcome");
       // theStage.setScene(new Scene(root, GetScreenWorkingWidth()/2 , GetScreenWorkingHeight()/2 ));
        theStage.setScene(new Scene(root, 400 , 600 ));

        theStage.show();
        addDragListeners(root, primaryStage);
    }

    public static void main(String[] args) {
        launch(args);

    }
    public static double GetScreenWorkingWidth() {

        return Toolkit.getDefaultToolkit().getScreenSize().getWidth()/2;
    }

    public static double GetScreenWorkingHeight() {

        return Toolkit.getDefaultToolkit().getScreenSize().getHeight();
    }
}
