package com.calculator.calculator;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;




public class CalcFormController {
    @FXML
    private Button bt3;

    @FXML
    private Button bt2;

    @FXML
    private Button bt5;

    @FXML
    private Button bt4;

    @FXML
    private Button bt7;

    @FXML
    private Button btMultiply;

    @FXML
    private Button btDivide;

    @FXML
    private Button bt6;

    @FXML
    private Button bt9;

    @FXML
    private Button bt8;

    @FXML
    private Button btPercent;

    @FXML
    private TextField txtEquation;

    @FXML
    private Button btClear;

    @FXML
    private Button btPlus;

    @FXML
    private Button btEqual;

    @FXML
    private Label lblAnswer;

    @FXML
    private Button btComma;

    @FXML
    private Button btMinus;

    @FXML
    private Button bt1;

    @FXML
    private Button bt0;

    private double answer = 0.0;
    private ButtonListener buttonListener;

    @FXML
    public void initialize(){
        Calculator calculator = new Calculator();
        lblAnswer.setText(String.format("%.2f",answer));
        buttonListener = new ButtonListener(txtEquation);

    }
    @FXML
    private void handleButtonClick(javafx.event.ActionEvent event) {
        Button clickedButton = (Button) event.getSource();
        String buttonText = clickedButton.getText();
        buttonListener.onButtonClicked(buttonText);
    }

}