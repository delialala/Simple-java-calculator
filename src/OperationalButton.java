import javax.swing.*;

public class OperationalButton extends JButton {

    public int getResult(){
        return CalculatorText.result;
    }
    public OperationalButton() {
        this.addActionListener(e -> changeText());
    }
    public void changeText() {
        Main.pressedButton = this;
        CalculatorText.previous = CalculatorText.result;
        CalculatorText.result = 0;
    }
}
