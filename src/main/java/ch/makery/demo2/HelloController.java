package ch.makery.demo2;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
//НЕдоделал и не понял 5 номер п
public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}