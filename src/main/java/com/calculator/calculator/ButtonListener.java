package com.calculator.calculator;

import javafx.scene.control.TextField;

public class ButtonListener {
    private TextField txtEquation;

    public ButtonListener(TextField txtEquation){
        this.txtEquation = txtEquation;
    }

    public void onButtonClicked(String btText){
        txtEquation.appendText(btText);
    }
}
