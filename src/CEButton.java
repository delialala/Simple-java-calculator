import javax.swing.*;

public class CEButton extends JButton {
    CEButton(){
        super();
        this.setText("CE");
        this.addActionListener(e -> changeText());
    }
    public void changeText(){
        CalculatorText.previous = 0;
        CalculatorText.result = 0;
        Main.resultTextField.setText("0");
        Main.pressedButton = new OperationalButton();
    }
}
