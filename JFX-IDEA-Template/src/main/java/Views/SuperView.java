package Views;

import javafx.application.Platform;
import javafx.fxml.FXML;

/**
 * Created by Indi on 1/27/2016.
 */
public class SuperView {
    @FXML
    public void CloseFunction() {
        Platform.exit();
    }

    @FXML
    public void HomeFunction() {
        FXController.Controller logout = new FXController.Controller();
        logout.setMainWindow("Home", "/FXML/App/ApplicationMenuWindow.fxml");
    }

    @FXML
    public void AboutFunction() {
        FXController.Controller logout = new FXController.Controller();
        logout.setMainWindow("Home", "/FXML/App/AboutViewWindow.fxml");
    }

}
