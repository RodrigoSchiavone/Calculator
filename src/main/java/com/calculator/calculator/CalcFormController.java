package com.calculator.calculator;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;




public class CalcFormController {
    @FXML
    private Button bt0, bt1, bt2, bt3, bt4, bt5, bt6, bt7, bt8, bt9,
            btPlus, btMinus, btMultiply, btDivide, btEqual, btClear,
            btComma, btPercent;

    @FXML
    private TextField txtEquation;

    @FXML
    private Label lblAnswer;

    private double answer = 0.0;



    @FXML
    public void initialize(){
        Calculator calculator = new Calculator();
        lblAnswer.setText(String.format("%.2f",answer));
        EquationInputManager equationInputManager = new EquationInputManager(txtEquation);
        ButtonListener buttonListener = new ButtonListener(equationInputManager);

        Button[] buttons = {bt0, bt1, bt2, bt3, bt4, bt5, bt6, bt7, bt8, bt9,
                btPlus, btMinus, btMultiply, btDivide, btEqual,
                btClear, btComma, btPercent};

        for (Button button : buttons) {
            button.setFocusTraversable(false);// Evita que o botão receba foco
            button.setOnAction((EventHandler<ActionEvent>) buttonListener);
        }
    }


}