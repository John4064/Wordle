package com.parkhurst.wordle;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import java.io.IOException;
import java.util.Objects;

import com.parkhurst.wordle.WordGenerator;
import javafx.stage.StageStyle;

public class WordleApp extends Application {

    public static String guessWord;
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(WordleApp.class.getResource("wordle-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 1024, 768);
        stage.setTitle("Wordle");
        //Icon origin https://www.flaticon.com/free-icons/vision"
        stage.getIcons().add(new Image(Objects.requireNonNull(WordleApp.class.getResourceAsStream("view.png"))));
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();

    }

    public static void main(String[] args) {
        launch();
    }
}