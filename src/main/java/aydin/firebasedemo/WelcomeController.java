package aydin.firebasedemo;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import java.io.IOException;

public class WelcomeController {

    @FXML
    private void onRegister(ActionEvent event) throws IOException {
        // When user clicks "Register", go to your existing Primary.fxml screen
        DemoApp.setRoot("primary");
    }

    @FXML
    private void onSignIn(ActionEvent event) throws IOException {
        // When user clicks "Sign In", go to your existing Secondary.fxml screen
        DemoApp.setRoot("secondary");
    }
}
