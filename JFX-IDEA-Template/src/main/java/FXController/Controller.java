package FXController;
/**
 * Created by Indi on 1/26/2016.
 */
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;

public class Controller extends App {
    //Double for mouse Coords
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
    public void setMainWindow(String Title, String fxmlURL) {
        try {
            App.root = FXMLLoader.load(getClass().getResource(fxmlURL));
            App.theStage.setTitle(Title);
          //App.theStage.setScene(new Scene(App.root, App.GetScreenWorkingWidth() / 1.1, App.GetScreenWorkingHeight() / 1.1));
            App.theStage.setScene(new Scene(App.root,400, 600));
          //App.theStage.centerOnScreen();
            App.theStage.show();
            //Listens for 'Dragging'
            addDragListeners(root, theStage);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}

