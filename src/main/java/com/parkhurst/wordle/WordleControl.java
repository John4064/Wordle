package com.parkhurst.wordle;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import com.parkhurst.wordle.WordGenerator.*;

import java.io.IOException;

public class WordleControl {
    //Fields
    @FXML
    private Label finalWord;
    @FXML
    private Label timeText;
    private boolean start = false;
    private String guessWord;

    @FXML
    protected void onStartButtonClick() throws IOException {
        if(start == false){
            start = true;
            guessWord = WordGenerator.getWord();
            finalWord.setText(guessWord);
            System.out.println("Start");
        }
        //
    }
}