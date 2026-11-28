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

        Scene scene = new Scene(fxmlLoader.load(), 950, 650);
        stage.setTitle("50azo Game");
        stage.setResizable(false);
        stage.setScene(scene);
        stage.show();
    }
}


/*
Solo pueda iniciar si seleccionó jugadores
como crear los jugadores
dar alerta de cuantos jugadores seleccionó
imprimir como log los jugadores seleccionados
alerta al iniciar juego


* */
