module org.example.CincuentazoGame {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.CincuentazoGame to javafx.fxml;
    exports org.example.CincuentazoGame;
    opens org.example.CincuentazoGame.Views to javafx.graphics;
    exports org.example.CincuentazoGame.Controllers;
    opens org.example.CincuentazoGame.Controllers to javafx.fxml;
}