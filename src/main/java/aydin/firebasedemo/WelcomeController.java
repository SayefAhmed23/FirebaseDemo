package aydin.firebasedemo;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import java.io.IOException;

public class WelcomeController {

    @FXML
    private void onRegister(ActionEvent event) throws IOException {

        DemoApp.setRoot("primary");
    }

    @FXML
    private void onSignIn(ActionEvent event) throws IOException {

        DemoApp.setRoot("secondary");
    }
}
