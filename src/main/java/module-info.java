module com.calculator.calculator {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens com.calculator.calculator to javafx.fxml;
    exports com.calculator.calculator;
}