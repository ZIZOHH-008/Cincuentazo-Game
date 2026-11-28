package org.example.CincuentazoGame.Controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.stage.Stage;
import org.example.CincuentazoGame.Models.IGameLog;
import org.example.CincuentazoGame.Views.GameView;

import java.io.IOException;



public class WelcomeController implements IGameLog {
    @FXML private Button players2Button;
    @FXML private Button players3Button;
    @FXML private Button players4Button;
    @FXML private Button rulesButtonWelcome;
    @FXML private Button startGameButton;


    @FXML
    private void initialize() {
        startGameButton.setOnAction(event -> startGame());
    }


    private void startGame() {
        try {
            GameView gameView = new GameView();
            gameView.show();

            Stage currentStage = (Stage) startGameButton.getScene().getWindow();
            currentStage.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
