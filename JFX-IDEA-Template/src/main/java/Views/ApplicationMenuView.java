package Views;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class ApplicationMenuView extends SuperView {
    public Label scene_DescriptionLabel;

    @FXML
    public void openAutomation() {
        FXController.Controller logout = new FXController.Controller();
        logout.setMainWindow("Home", "/FXML/Sample/SampleWindow.fxml");
    }

}
