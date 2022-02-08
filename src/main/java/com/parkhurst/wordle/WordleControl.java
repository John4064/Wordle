package com.parkhurst.wordle;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import com.parkhurst.wordle.WordleApp.*;
public class WordleControl {
    @FXML
    private Label finalWord;

    @FXML
    protected void onSubmitButtonClick() {

        finalWord.setText(WordleApp.guessWord);
    }
}