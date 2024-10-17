package com.calculator.calculator;

import javafx.scene.control.TextField;

public class EquationInputManager {
    TextField txtEquation;
    public EquationInputManager(TextField txtEquation){
        this.txtEquation = txtEquation;
    }

    public void onButtonClicked(String btText){
        int caracterePosition = txtEquation.getCaretPosition();
        System.out.println(caracterePosition);

        if (!txtEquation.getSelectedText().isEmpty()){
            txtEquation.replaceSelection(btText);
        }else{
            txtEquation.insertText(caracterePosition,btText);
            txtEquation.positionCaret(caracterePosition+btText.length());
        }

    }
}
