module com.parkhurst.wordle {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.parkhurst.wordle to javafx.fxml;
    exports com.parkhurst.wordle;
}