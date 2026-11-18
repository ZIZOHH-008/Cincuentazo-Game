package org.example.CincuentazoGame.Views;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class WelcomeView extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(
                WelcomeView.class.getResource("/org/example/CincuentazoGame/WelcomeView.fxml")
        );

        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("50azo Game");
        stage.setScene(scene);
        stage.show();
    }
}
