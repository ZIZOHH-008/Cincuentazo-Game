package org.example.CincuentazoGame.Views;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.example.CincuentazoGame.Controllers.GameController;

import java.io.IOException;



public class GameView extends Stage {
    private GameController controller;


    public GameView() throws IOException {
        FXMLLoader loader = new FXMLLoader(
                getClass().getResource("/org/example/CincuentazoGame/GameView.fxml")
        );

        Parent root = loader.load();
        controller = loader.getController();

        setTitle("Cincuentazo");
        setScene(new Scene(root));
        setResizable(false);
        sizeToScene();
    }

    public void startNewGame() {
        controller.startNewGame();
    }
}