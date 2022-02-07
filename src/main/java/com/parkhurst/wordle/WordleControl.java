package com.parkhurst.wordle;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class WordleControl {
    @FXML
    private Label finalWord;

    @FXML
    protected void onSubmitButtonClick() {
        finalWord.setText("Pets");
    }
}