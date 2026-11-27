package org.example.CincuentazoGame.Controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;


public class GameController {
    @FXML private HBox boxBot1Status;
    @FXML private HBox boxBot2Status;
    @FXML private HBox boxBot3Status;
    @FXML private HBox boxPlayerStatus;
    @FXML private Button exitButton;
    @FXML private Button helpButtom;
    @FXML private Button hitmeButton;
    @FXML private Button image1Card;
    @FXML private Button image2Card;
    @FXML private Button image3Card;
    @FXML private Button image4Card;
    @FXML private ImageView imageLastCard;
    @FXML private Label labelCardsBot1;
    @FXML private Label labelCardsBot2;
    @FXML private Label labelCardsBot3;
    @FXML private Label labelCardsPlayer;
    @FXML private Label labelTurn;
    @FXML private Button playCardButton;
    @FXML private TextField selectedCardField;

}
