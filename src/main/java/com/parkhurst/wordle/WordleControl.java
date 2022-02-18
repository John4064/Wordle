package com.parkhurst.wordle;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;

public class WordleControl {
    //Fields
    @FXML
    private Label finalWord;
    @FXML
    public Button exitB;
    private boolean start = false;
    private String guessWord;

    public WordleControl() throws IOException {
        guessWord = WordGenerator.getWord();
    }


    @FXML
    protected void onExitClick() throws IOException{
        //Dead Code keeping for future functionality
        Stage stage = (Stage) exitB.getScene().getWindow();
        stage.close();
    }

    @FXML
    protected void onStartButtonClick() throws IOException {
        if(!start){
            start = true;

            finalWord.setText(guessWord);
            System.out.println("Start");
        }
        //
    }
}