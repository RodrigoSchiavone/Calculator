package com.calculator.calculator;
import javafx.scene.control.Label;
import java.util.ArrayList;

public class DisplayView {
    private Label lblAnswer;
    private ArrayList<String> display;
    private int lastEquationIndex;
    private int maxEquationDisplay = 4;
    private StringBuilder textDisplayView = new StringBuilder();


    public DisplayView(Label lblAnswer){
        this.lblAnswer = lblAnswer;
        this.display = new ArrayList<String>();
    }



    public void setDisplay(String newDisplay){
        display.add(newDisplay + "\n");
        lastEquationIndex = display.size()-1;
        updateDisplay(lastEquationIndex);
    }

    private void updateDisplay(int lastEquationIndex) {
        textDisplayView.setLength(0);
        int startIndex = maxEquationDisplay-1;
        if(lastEquationIndex- startIndex <=0){
            for(int i=0;i<= lastEquationIndex;i++){
                textDisplayView.append(display.get(i).toString());
            }
        }else{
            for(int i=lastEquationIndex-startIndex;i<= lastEquationIndex;i++) {
                textDisplayView.append(display.get(i).toString());
            }
        }
        lblAnswer.setText(textDisplayView.toString());
    }

    public void clearDisplay(){
        textDisplayView.setLength(0);
        lblAnswer.setText("0,00");
    }
}
