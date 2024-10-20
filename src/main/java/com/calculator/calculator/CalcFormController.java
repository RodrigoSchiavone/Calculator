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

    private DisplayView displayView;


    @FXML
    public void initialize(){
        Calculator calculator = new Calculator();
        EquationInputManager equationInputManager = new EquationInputManager(txtEquation);
        ButtonListener buttonListener = new ButtonListener(equationInputManager);
        displayView = new DisplayView(lblAnswer);


        Button[] buttons = {bt0, bt1, bt2, bt3, bt4, bt5, bt6, bt7, bt8, bt9,
                btPlus, btMinus, btMultiply, btDivide, btEqual,
                btClear, btComma, btPercent};

        for (Button button : buttons) {
            button.setFocusTraversable(false);// Evita que o botão receba foco
            button.setOnAction((EventHandler<ActionEvent>) buttonListener);
        }

        displayView.setDisplay("10+5=15");
        displayView.setDisplay("10+5=16");
        displayView.setDisplay("10+5=17");
        displayView.setDisplay("10+5=18");
        displayView.setDisplay("10+5=19");
        displayView.setDisplay("10+5=20");
        displayView.setDisplay("10+5=21");
        displayView.setDisplay("10+5=22");
        displayView.setDisplay("10+5=23");
        displayView.clearDisplay();


    }


}