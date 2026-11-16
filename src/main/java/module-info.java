module org.example._0azo {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example._0azo to javafx.fxml;
    exports org.example._0azo;
}