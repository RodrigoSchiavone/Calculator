package com.calculator.calculator;

import javafx.event.ActionEvent;
import javafx.scene.control.TextField;
import javafx.event.EventHandler;
import javafx.scene.control.Button;


public class ButtonListener implements EventHandler<ActionEvent>{
    private EquationInputManager equationInputManager;

    public ButtonListener(EquationInputManager equationInputManager){
        this.equationInputManager = equationInputManager;
    }

    @Override
    public void handle(ActionEvent event){
        Button clickedButton = (Button) event.getSource();
        String btText = clickedButton.getText();
        equationInputManager.onButtonClicked(btText);
    }



}
